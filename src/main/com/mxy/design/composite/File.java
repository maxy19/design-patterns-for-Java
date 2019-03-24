package com.mxy.design.composite;

import com.google.common.base.Strings;

public class File extends AbsFile {


    private String fileName;
    private int level;

    public  File(String fileName, int level) {
        this.fileName = fileName;
        this.level = level;
    }

    @Override
    protected void print() {
        System.out.println(Strings.repeat("-",level)+"|:"+fileName);
    }


}
