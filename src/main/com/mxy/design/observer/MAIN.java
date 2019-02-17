package com.mxy.design.observer;

/**
 * 观察者模式
 */
public class MAIN {

    public static void main(String[] args) {

        WeChatSubject subject = new WeChatSubjectImpl();
        //微信公众号关注的用户
        subject.followUser(new WeChatUser(1, "张三"));
        subject.followUser(new WeChatUser(3, "李四"));
        subject.followUser(new WeChatUser(2, "王五"));
        //推送文章
        subject.notifyObServer("C#学习入门");
        //王五不关注了 觉得该公众号很烂 ^_^
        subject.cancelFollowUser(new WeChatUser(2,"王五"));

        //继续推送文章给其他两位
        subject.notifyObServer("spring学习入门");



    }

}
