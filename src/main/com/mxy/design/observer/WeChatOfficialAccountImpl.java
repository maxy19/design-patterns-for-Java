package com.mxy.design.observer;

import com.google.common.base.Preconditions;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;


public class WeChatOfficialAccountImpl implements WeChatOfficialAccount {

    private List<WeChatUser> users = new ArrayList<>();

    public List<WeChatUser> getUsers() {
        return users;
    }

    public void setUsers(List<WeChatUser> users) {
        this.users = users;
    }

    @Override
    public boolean followUser(WeChatUser weChatUser) {
        System.out.println(weChatUser.getUserName() + "-->关注了该公众号.");
        return users.add(weChatUser);
    }

    @Override
    public boolean cancelFollowUser(WeChatUser weChatUser) {
        System.out.println(weChatUser.getUserName() + "-->取消了关注.");
        users.remove(weChatUser);
        return true;
    }

    @Override
    public boolean notifyObServer(String sendMsg) {
        articleInfo(sendMsg);
        return true;
    }

    private void articleInfo(String articleInfo) {
        Preconditions.checkArgument(StringUtils.isNotBlank(articleInfo));
        users.stream().forEach(u -> {
            u.update(u.getUserName() + "-已收到文章-" + articleInfo + ".");
        });
    }
}
