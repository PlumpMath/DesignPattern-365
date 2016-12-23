package message;

/**
 * 修正抽象化角色：扩展抽象化角色，改变和修正父类对抽象化的定义。
 * 普通消息类
 */
public class CommonMessage extends AbstractMessage {

    public CommonMessage(MessageInterface m) {
        super(m);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        //对于普通消息，直接调用父类方法，发送消息即可
        super.sendMessage(message, toUser);
    }
}
