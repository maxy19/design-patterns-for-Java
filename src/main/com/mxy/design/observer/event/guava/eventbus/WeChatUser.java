package com.mxy.design.observer.event.guava.eventbus;


import com.google.common.base.Objects;

import java.io.Serializable;

/**
 * 微信用户 实现观察接口 随时接受更新的信息
 */
public class WeChatUser implements Serializable {

    private int id;
    private String userName;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    public WeChatUser(int id, String userName,String type) {
        this.id = id;
        this.type = type;
        this.userName = userName;
    }


    public void update(String receiveMsg) {
        System.out.println(receiveMsg);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeChatUser that = (WeChatUser) o;
        return id == that.id &&
                Objects.equal(userName, that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, userName);
    }
}
