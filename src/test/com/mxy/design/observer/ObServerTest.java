package com.mxy.design.observer;

import org.junit.Test;

/**
 * 观察者模式:在对象之间定义了一对多的依赖，这样一来，当一个对象改变状态，依赖它的对象会收到通知并自动更新。
 * 其实就是发布订阅模式，发布者发布信息，订阅者获取信息，订阅了就能收到信息，没订阅就收不到信息。
 */

public class ObServerTest {

    @Test
    public void logicTest() {
        WeChatOfficialAccount account = new WeChatOfficialAccountImpl();
        //微信公众号关注的用户
        account.followUser(new WeChatUser(1, "张三"));
        account.followUser(new WeChatUser(3, "李四"));
        account.followUser(new WeChatUser(2, "王五"));
        //推送文章
        account.notifyObServer("C#学习入门");
        //王五不关注了 觉得该公众号很烂 ^_^
        account.cancelFollowUser(new WeChatUser(2, "王五"));
        //继续推送文章给其他两位
        account.notifyObServer("spring学习入门");
    }


}
