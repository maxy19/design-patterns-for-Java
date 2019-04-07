package com.mxy.design.builder;

public class StringBuilder extends AbstractBuilder {


    @Override
    public StringBuilder append(String value) {
        super.append(value);
        return this;
    }

    @Override
    public StringBuilder append(Integer value) {
        super.append(value);
        return this;
    }

    @Override
    public StringBuilder append(Boolean value) {
        super.append(value);
        return this;
    }

    @Override
    public String toString() {
        String s = "";
        for (String str : strList) {
            s += str;
        }
        return s;
    }
}
