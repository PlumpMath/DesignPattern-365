/**
 * 环境角色：定义客户端所感兴趣的接口，并且保留一个具体状态类的实例。
 * 这个具体状态类的实例给出此环境对象的现有状态。
 */
public class Context {

    private State mState;

    public void setState(State state) {
        mState = state;
    }

    /**
     * 用户感兴趣的接口方法
     * @param sampleParameter
     */
    public void request(String sampleParameter) {
        //转调mState来处理
        mState.handle(sampleParameter);
    }
}
