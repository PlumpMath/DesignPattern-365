/**
 * 具体构件角色：这是被装饰者，定义一个将要被装饰增加功能的类
 */
public class MessageBoard implements MessageBoardHandler {

    @Override
    public String filter(String msg) {
        return "处理留言板上的内容：" + msg;
    }
}
