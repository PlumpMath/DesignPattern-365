/**
 * 负责人角色：
 * （1）负责保存备忘录对象。
 * （2）不检查备忘录对象的内容。
 */
public class Caretaker {

    private Memento mMemento;

    /**
     * 备忘录的取值方法
     * @return
     */
    public Memento retrieveMemento() {
        return mMemento;
    }

    /**
     * 备忘录的赋值方法
     * @param memento
     */
    public void saveMemento(Memento memento) {
        mMemento = memento;
    }
}
