package com.mxy.design.composite;

import org.junit.Test;

/**
 * 组合模式:又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。
 * JDK 中 Map#PutAll List#addAll 使用这种模式
 * 场景：递归，树形结构,has a等场景
 */
public class CompositeTest {

    @Test
    public void logicTest() {

        File file3 = new File("设计模式.pdf",3);
        File file2 = new File("Core java.pdf",3);
        File file1 = new File("Java自学技巧.pdf",3);

        Folder folder = new Folder(file1,file2,file3);
        folder.add(new Folder("收藏夹",1));
        folder.add(new Folder("Java自学",2));

        folder.print();

        file2 = new File("火影忍者.pdf",3);
        file1 = new File("七龙珠.pdf",3);
        folder = new Folder(file1,file2);
        folder.add(new Folder("漫画",2));

        folder.print();


    }


}
