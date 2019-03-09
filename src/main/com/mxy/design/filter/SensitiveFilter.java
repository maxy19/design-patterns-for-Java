package com.mxy.design.filter;

import org.apache.commons.lang3.StringUtils;

/**
 * 去敏感词
 */
public class SensitiveFilter implements Filter{
    @Override
    public String processString(String str) {
        if(StringUtils.isNotBlank(str)){
            return str.replaceAll("杀","XX");
        }
        return "";
    }
}
