/**
 * 抽象构件角色：定义一个抽象接口，以规范准备接收附加责任的对象。
 */
public interface MessageBoardHandler {

    public String filter(String msg);
}
