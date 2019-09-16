package com.mxy.design.observer.event.guava.eventbus;

import com.google.common.base.Preconditions;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;


public class WeChatOfficialAccount {

    private static List<WeChatUser> users = new ArrayList<>();

    public static List<WeChatUser> getUsers() {
        return users;
    }

    public static void setUsers(List<WeChatUser> users) {
        WeChatOfficialAccount.users = users;
    }

    public static void notifyObServer(String msg) {
        Preconditions.checkArgument(StringUtils.isNotBlank(msg));
        users.stream().forEach(u -> {
            u.update(u.getUserName() + "-已收到文章-" + msg + ".");
        });
    }

}
