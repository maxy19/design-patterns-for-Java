package com.mxy.design.observer;

public interface WeChatOfficialAccount {

    /**
     * 该公众号关注的用户
     * @return
     */
    boolean followUser(WeChatUser weChatUser);
    /**
     * 用户取消关注该公众号
     * @return
     */
    boolean cancelFollowUser(WeChatUser weChatUser);

    /**
     * 公众号有新消息
     * 通知观察者
     * @return
     */
    boolean notifyObServer(String sendMsg);


}
