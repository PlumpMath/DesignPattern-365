package main;

import message.AbstractMessage;
import message.CommonMessage;
import message.MessageInterface;
import message.UrgencyMessage;

public class Main {

    public static void main(String[] args) {
        //创建具体的实现对象
        MessageInterface inter = new MessageSMS();
        //创建普通消息对象
        AbstractMessage message = new CommonMessage(inter);
        message.sendMessage("加班申请速批", "李总");
        //将实现方式切换成邮件，再次发送
        inter = new MessageEmail();
        message = new UrgencyMessage(inter);
        message.sendMessage("加班申请速批", "李总");
    }
}
