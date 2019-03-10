package com.mxy.design.filter;

import org.apache.commons.lang3.StringUtils;

/**
 * 去空格
 */
public class SpacingFilter implements Filter {
    @Override
    public String processString(String str) {
        if(StringUtils.isNotBlank(str)){
            return str.replaceAll(" ","_");
        }
        return "";
    }
}
