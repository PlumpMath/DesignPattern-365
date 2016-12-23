/**
 * 具体享元角色：实现抽象享元角色所规定出的接口。
 * 如果有内蕴状态的话，必须负责为内蕴状态提供存储空间。
 */
public class ConcreteFlyweight implements Flyweight {

    private Character mState = null;

    /**
     * 构造函数，内蕴状态作为参数传入
     * @param state
     */
    public ConcreteFlyweight(Character state) {
        mState = state;
    }

    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为，
     * 但是并不改变对象的内蕴状态。
     */
    @Override
    public void operation(String state) {
        System.out.println("Intrinsic State = " + mState);
        System.out.println("Extrinsic State = " + state);
    }
}
