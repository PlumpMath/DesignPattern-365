/**
 * 抽象状态角色：定义一个接口，用以封装环境对象的一个特定的状态所对应的行为。
 */
public interface State {

    /**
     * 状态对应的处理
     * @param sampleParameter
     */
    public void handle(String sampleParameter);
}
