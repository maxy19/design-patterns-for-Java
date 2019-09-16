package com.mxy.design.observer.event.driver;

import org.junit.Test;

import java.util.EventObject;
import java.util.Objects;

/**
 * 使用事件驱动 关键点 1.事件源 2.事件监听 3.事件对象
 * 必要条件 主题(1)与观察者(n)  或者说是可观察者(1)与观察者(n)
 * 着重强调 解耦思维方式
 */
public class EventDriverTest {

    @Test
    public void logicTest() {
        EventSource source = new EventSource();
        ObServerListener followUserListener = new ObServerListener() {
            @Override
            public void handleEvent(EventObject event) {
                WeChatOfficialAccount account = (WeChatOfficialAccount) event;
                if (Objects.equals(account.getSource(), "followUser")) {
                    account.followUser(account.getUser());
                }
            }
        };
        ObServerListener cancelFollowUserListener = new ObServerListener() {
            @Override
            public void handleEvent(EventObject event) {
                WeChatOfficialAccount account = (WeChatOfficialAccount) event;
                if (Objects.equals(account.getSource(), "cancelFollowUser")) {
                    account.cancelFollowUser(account.getUser());
                }
            }
        };
        source.addListener(followUserListener);
        source.addListener(cancelFollowUserListener);
        source.notifies("followUser", new WeChatUser(2, "王五"));
        source.notifies("followUser", new WeChatUser(1, "张三"));
        source.notifies("followUser", new WeChatUser(3, "李四"));

        //推送文章
        WeChatOfficialAccount.notifyObServer("C#学习入门");
        //王五不关注了 觉得该公众号很烂 ^_^
        source.notifies("cancelFollowUser", new WeChatUser(2, "王五"));
        //继续推送文章给其他两位
        WeChatOfficialAccount.notifyObServer("spring学习入门");
    }

}
