package message;

/**
 * 抽象化角色：抽象化给出的定义，并保存一个对实现化对象的引用。
 * 抽象消息类
 */
public abstract class AbstractMessage {

    MessageInterface messageInterface;

    /**
     * 构造方法，传入实现部分的对象
     * @param m 实现部分的对象
     */
    public AbstractMessage(MessageInterface m) {
        messageInterface = m;
    }

    /**
     * 发送消息，委派给实现部分的方法
     * @param message 要发送消息的内容
     * @param toUser  消息的接收者
     */
    public void sendMessage(String message, String toUser) {
        messageInterface.send(message, toUser);
    }
}
