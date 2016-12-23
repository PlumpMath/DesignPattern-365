/**
 * 请求者角色：负责调用命令对象执行请求，相关的方法叫做行动方法。
 */
public class Invoker {

    private Command mCommand = null;

    public Invoker(Command command) {
        mCommand = command;
    }

    public void action() {
        mCommand.execute();
    }
}
