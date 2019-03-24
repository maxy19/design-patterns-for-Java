package com.mxy.design.composite;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbsFile {

    private String folderName;
    private int level;
    List<AbsFile> folders = new ArrayList<>();
    List<AbsFile> files = new ArrayList<>();

    public Folder(String folderName, int level) {
        this.folderName = folderName;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<AbsFile> getFiles() {
        return files;
    }

    public void setFiles(List<AbsFile> files) {
        this.files = files;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public Folder(AbsFile... file) {
        files.addAll(Lists.newArrayList(file));
    }


    public void add(AbsFile folder) {
        folders.add(folder);
    }

    @Override
    protected void print() {
        folders.addAll(files);
        for (AbsFile file : folders) {
            if (file instanceof Folder) {
                System.out.println(Strings.repeat("-", ((Folder) file).getLevel()) + ":" + ((Folder) file).getFolderName());
            }else {
                file.print();
            }
        }
    }
}
