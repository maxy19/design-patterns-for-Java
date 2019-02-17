package com.mxy.design.observer;


import com.google.common.base.Objects;

/**
 * 微信用户 实现观察接口 随时接受更新的信息
 */
public class WeChatUser implements ObServer {

    private int id;
    private String userName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public WeChatUser(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }


    @Override
    public void update(String receiveMsg) {
        System.out.println(receiveMsg);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeChatUser user = (WeChatUser) o;
        return id == user.id &&
                Objects.equal(userName, user.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, userName);
    }
}
