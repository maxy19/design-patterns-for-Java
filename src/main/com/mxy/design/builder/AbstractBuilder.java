package com.mxy.design.builder;

import com.google.common.collect.Lists;

import java.util.List;

public abstract class AbstractBuilder {


    protected List<String> strList = Lists.newArrayList();


    protected AbstractBuilder append(String value) {
        strList.add(value);
        return this;
    }

    protected AbstractBuilder append(Integer value) {
        strList.add(value.toString());
        return this;
    }

    protected AbstractBuilder append(Boolean value) {
        if(Boolean.TRUE){
            strList.add("正确");
        }else{
            strList.add("错误");
        }
        return this;
    }


}
