package main;

import message.MessageInterface;

/**
 * 具体实现化角色：这个角色给出实现化角色接口的具体实现。
 * 邮件短消息的实现类
 */
public class MessageEmail implements MessageInterface {

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用邮件短消息的方法，发送消息'" + message + "'给" + toUser);
    }
}
