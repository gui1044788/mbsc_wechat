package com.xhsd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhsd.constant.CommonCst;
import com.xhsd.dto.CommonResultDto;
import com.xhsd.dto.SpInGetPatInfoResDto;
import com.xhsd.entity.ZyHzzl;
import com.xhsd.form.SpInGetPatInfoForm;
import com.xhsd.form.SpInSetPatInfoForm;
import com.xhsd.form.SpPatInfoForm;
import com.xhsd.mapper.datasource34.ZyHzzlMapper;
import com.xhsd.service.ZyHzzlService;
import com.xhsd.utils.BeanXmlUtils;
import com.xhsd.utils.Result;
import com.xhsd.utils.ReturnCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * (com.xhsd.entity.ZyHzzl)表服务实现类
 *
 * @author guijun
 * @since 2023-05-29 16:30:52
 */
@Service
@Slf4j
public class ZyHzzlServiceImpl extends ServiceImpl<ZyHzzlMapper, ZyHzzl> implements ZyHzzlService {

    @Override
    public Result<CommonResultDto> spInSetPatInfo(SpPatInfoForm form) {
        CommonResultDto dto = new CommonResultDto();
        try {
            String xml = BeanXmlUtils.bean2xml(form, null);
            xml = xml.replace("__", "_");
            SpInSetPatInfoForm resForm = new SpInSetPatInfoForm();
            resForm.setMsgBody(xml);
            baseMapper.spInSetPatInfo(resForm);
            dto.setCode(resForm.getRetValue());
            dto.setMsg(resForm.getRetDesc());
        } catch (Exception e) {
            log.error("spInSetPatInfo is error :{}", e.getMessage());
            dto.setCode(CommonCst.STR_MINUS_ONE);
            dto.setMsg(e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        return Result.success(dto);
    }

    @Override
    public SpInGetPatInfoResDto spInGetPatInfo(SpInGetPatInfoForm form) {
        String xml = BeanXmlUtils.bean2xml(form, null);
        return baseMapper.spInGetPatInfo(xml);
    }

}

