/**
 * 备忘录角色：
 * （1）将发起人对象的内战状态存储起来。备忘录可以根据发起人对象的判断来决定存储多少发起人对象的内部状态。
 * （2）备忘录可以保护其内容不被发起人对象之外的任何对象所读取。
 */
public class Memento {

    private String mState;

    public Memento(String state) {
        mState = state;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }
}
