package com.mxy.design.filter;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * 责任链模式: 收集所有请求放到(集合，链表等) ,收集的每个对象单独处理自己任务，互不干预且可以按照定制化顺序进行处理知道处理完
 * 整条链路上所有请求为止。
 */
public class FilterTest {

    @Test
    public void logicTest() {
        String str = "杀人 放火者杀无赦";
        System.out.println("处理前===="+str);
        List<Filter> filters = Lists.newArrayList(new SensitiveFilter(), new SpaceFilter());
        for (Filter f : filters) {
            str = f.processString(str);
        }
        System.out.println("处理后===="+str);
    }

}
