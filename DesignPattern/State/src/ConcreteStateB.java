/**
 * 具体状态角色：每一个具体状态类都实现了环境的一个状态所对应的行为。
 */
public class ConcreteStateB implements State {

    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateB handle:" + sampleParameter);
    }
}
