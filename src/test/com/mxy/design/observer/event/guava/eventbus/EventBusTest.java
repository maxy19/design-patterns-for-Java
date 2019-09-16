package com.mxy.design.observer.event.guava.eventbus;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import org.junit.Test;

import java.util.Objects;

public class EventBusTest {

    @Test
    public void logicTest() {
        EventBus eventBus = new EventBus();
        eventBus.register(new Object() {
            @Subscribe
            public void followUser(WeChatUser weChatUser) {
                if (!Objects.equals(weChatUser.getType(), "followUser")) {
                    return;
                }
                System.out.println(weChatUser.getUserName() + "-->关注了该公众号.");
                WeChatOfficialAccount.getUsers().add(weChatUser);
            }

            @Subscribe
            public void cancelFollowUser(WeChatUser weChatUser) {
                if (!Objects.equals(weChatUser.getType(), "cancelFollowUser")) {
                    return;
                }
                System.out.println(weChatUser.getUserName() + "-->取消了关注.");
                WeChatOfficialAccount.getUsers().remove(weChatUser);
            }
        });
        eventBus.post(new WeChatUser(1, "张三", "followUser"));
        eventBus.post(new WeChatUser(2, "李四", "followUser"));
        eventBus.post(new WeChatUser(3, "王五", "followUser"));

        WeChatOfficialAccount.notifyObServer("C#学习入门");

        //王五不关注了 觉得该公众号很烂 ^_^
        eventBus.post(new WeChatUser(3, "王五","cancelFollowUser"));
        //继续推送文章给其他两位
        WeChatOfficialAccount.notifyObServer("spring学习入门");
    }

}
