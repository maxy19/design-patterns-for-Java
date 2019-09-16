package com.mxy.design.observer.event.driver;

import com.google.common.base.Preconditions;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;


public class WeChatOfficialAccount extends EventObject {

    private static List<WeChatUser> users = new ArrayList<>();
    private WeChatUser user;
    private String source;

    public WeChatUser getUser() {
        return user;
    }

    public void setUser(WeChatUser user) {
        this.user = user;
    }

    @Override
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }


    public WeChatOfficialAccount(String source, WeChatUser user) {
        super(source);
        this.source = source;
        this.user = user;
    }

    public boolean followUser(WeChatUser weChatUser) {
        System.out.println(weChatUser.getUserName() + "-->关注了该公众号.");
        return users.add(weChatUser);
    }

    public boolean cancelFollowUser(WeChatUser weChatUser) {
        System.out.println(weChatUser.getUserName() + "-->取消了关注.");
        return users.remove(weChatUser);
    }

    public static void notifyObServer(String msg) {
        Preconditions.checkArgument(StringUtils.isNotBlank(msg));
        users.stream().forEach(u -> {
            u.update(u.getUserName() + "-已收到文章-" + msg + ".");
        });
    }
}
