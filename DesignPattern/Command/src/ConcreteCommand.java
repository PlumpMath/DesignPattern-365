/**
 * 具体命令角色：定义一个接收者和行为之间的弱耦合；
 * 实现execute()方法，负责调用接收者的相应操作。execute()方法通常叫做执行方法。
 */
public class ConcreteCommand implements Command {

    private Receiver mReceiver = null;

    public ConcreteCommand(Receiver receiver) {
        mReceiver = receiver;
    }

    @Override
    public void execute() {
        //通常会转调接收者对象的相应方法，让接收者来真正执行功能
        mReceiver.action();
    }
}
