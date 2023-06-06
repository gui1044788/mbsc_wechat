package com.xhsd.filter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xhsd.utils.MaskDataUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 *  返回值过敏过滤器
 *
 * @author guij
 * @Title: MaskDataFilter
 **/
@Slf4j
@Component
public class MaskDataFilter implements Filter {

    //姓名
    private static List<String> maskNameList = Arrays.asList("brxm","lxrm");
    //身份证号码
    private static List<String> maskIdCardList =  Arrays.asList("sfzh");
    //地址
    private static List<String> maskAddressList =  Arrays.asList("hkdz","hkdzQtdz","csd","xzz","xzzQtdz","lxdz");
    //电话
    private static List<String> maskMobileList =  Arrays.asList("xzzDh","hkdh","lxdh","dwdh");


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String uri = request.getRequestURI();

        // 转换成代理类
        ResponseWrapper wrapperResponse = new ResponseWrapper(response);
        // 这里只拦截返回，直接让请求过去，如果在请求前有处理，可以在这里处理
        filterChain.doFilter(request, wrapperResponse);
        // 返回值字节
        byte[] content = wrapperResponse.getContent();
        // 判断是否有值
        if (content.length <= 0) {
            return;
        }
        // 返回值
        String str = new String(content, "UTF-8");
        // 调用链
        if (!isJson(str)) {
            // 如果不是json数据,可能是返回的数据流或下载文件,直接返回原数据
            ServletOutputStream out = response.getOutputStream();
            out.write(content);
            out.flush();
        } else {
            // 处理返回数据
            String cipherText = str;
            try {
                Map<String, Object> ciMap = JSONObject.parseObject(str);
                Map<String, Object> data = (Map<String, Object>) ciMap.get("data");
                maskHandle(data);
                ciMap.put("data", data);
                cipherText = JSONObject.toJSONString(ciMap);
            } catch (Exception e) {
                log.error("#####MaskDataFilter->返回参数掩码失败,{}",e.getMessage());
            }
            //把返回值输出到客户端
            ServletOutputStream out = response.getOutputStream();
            out.write(cipherText.getBytes());
            out.flush();
        }
    }

    private static void maskHandle(Map<String, Object> data) {
        Set<String> keyLsit = data.keySet();
        List<String> maskList = new ArrayList<>(keyLsit);
        for (int i = 0; i < keyLsit.size(); i++) {
            String str2 = (String) data.get(maskList.get(i));
            if (StringUtils.isBlank(str2)) {
                continue;
            }
            if (maskNameList.contains(maskList.get(i))) {
                data.put(maskList.get(i), MaskDataUtils.desensitizedName(str2));
            }
            if (maskIdCardList.contains(maskList.get(i))) {
                data.put(maskList.get(i), MaskDataUtils.desensitizedIdNumber(str2));
            }
            if (maskAddressList.contains(maskList.get(i))) {
                data.put(maskList.get(i), MaskDataUtils.desensitizedAddress(str2));
            }
            if (maskMobileList.contains(maskList.get(i))) {
                data.put(maskList.get(i), MaskDataUtils.desensitizedPhoneNumber(str2));
            }
        }
    }


    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }


    @Override
    public void destroy() {

    }


    /**
     * 判断字符串数据是否为json
     *
     * @param content
     * @return
     */
    public static boolean isJson(String content) {
        try {
            JSON.parseObject(content);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

