package com.xhsd.utils;

import com.thoughtworks.xstream.XStream;

import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BeanXmlUtils {
    private static final String TAG = "XmlBeanUtils";
    private static final String FILTER_BLANK_XML = "\\s{3,}|\t|\r|\n";

    /**
     * Bean 转换成 xml
     * 特殊别名用classMap传入,也可以依赖bean的注解
     *
     * @param bean
     * @param clazzMap
     * @return
     */
    public static String bean2xml(Object bean, Map<String, Class> clazzMap) {
        XStream xstream = getXStreamByBean(bean, clazzMap);
        String xml = xstream.toXML(bean);
        return xml;
    }

    /**
     * Bean 转换成 xml
     * 特殊别名用classMap传入,也可以依赖bean的注解
     *
     * @param bean
     * @param clazzMap
     * @return
     */
    public static XStream getXStreamByBean(Object bean, Map<String, Class> clazzMap) {

        XStream xstream = new XStream();
        xstream.autodetectAnnotations(true);
        xstream.aliasSystemAttribute(null, "class");
        if (clazzMap != null) {
            for (Iterator it = clazzMap.entrySet().iterator(); it.hasNext(); ) {
                Map.Entry<String, Class> m = (Map.Entry<String, Class>) it.next();
                xstream.alias(m.getKey(), m.getValue());
            }
        }
        return xstream;
    }

    /**
     * 该方法不能依赖bean里面的注解,必须手动传入别名映射
     *
     * @param clazzMap
     * @param xml
     * @return
     */
    public static Object xml2Bean(Map<String, Class> clazzMap, String xml) {
        try {
            XStream xstream = new XStream();
            for (Iterator it = clazzMap.entrySet().iterator(); it.hasNext(); ) {
                Map.Entry<String, Class> m = (Map.Entry<String, Class>) it.next();
                xstream.alias(m.getKey(), m.getValue());
            }
            xstream.ignoreUnknownElements();

            Object bean = xstream.fromXML(xml);
            return bean;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 过滤报文中的空值</br>
     * 注：会过滤掉属性中的空值，考虑好再用
     * @param str
     * @return
     */
    public static String filterBlankXMl(String str) {
        //校验规则1位有一个空格就开始过滤，如果改为3则三个连续空格才过滤
        Pattern pattern = Pattern.compile(FILTER_BLANK_XML);
        Matcher m = pattern.matcher(str);
        str = m.replaceAll("");
        return str;
    }


}
