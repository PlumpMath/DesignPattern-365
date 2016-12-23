/**
 * 发起人角色：
 * （1）创建一个含有当前的内部状态的备忘录对象。
 * （2）使用备忘录对象存储其内部状态。
 */
public class Originator {

    private String mState;

    /**
     * 工厂方法，返回一个新的备忘录对象
     * @return
     */
    public Memento createMemento() {
        return new Memento(mState);
    }

    /**
     * 将发起人恢复到备忘录对象所记载的状态
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        mState = memento.getState();
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
        System.out.println("当前状态：" + mState);
    }
}
