/**
 * 装饰角色：持有一个构件对象的实例，并定义了抽象构件定义的接口。
 */
public class MessageBoardDecorator implements MessageBoardHandler {

    private MessageBoardHandler mHandler;

    public MessageBoardDecorator(MessageBoardHandler handler) {
        super();
        mHandler = handler;
    }

    @Override
    public String filter(String msg) {
        return mHandler.filter(msg);
    }
}
