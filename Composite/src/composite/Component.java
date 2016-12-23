package composite;

/**
 * 抽象构件角色：
 * 这是一个抽象角色，它给参加组合的对象定义出公共的接口及其默认行为，可以用来管理所有的子对象。
 * 合成对象通常把它所包含的子对象当做类型为Component的对象。
 * 在安全式的合成模式里，构件角色并不定义出管理子对象的方法，这一定义由树枝构件对象给出。
 */
public interface Component {

    /**
     * 输出组件自身的名称
     */
    public void printStruct(String preStr);
}
