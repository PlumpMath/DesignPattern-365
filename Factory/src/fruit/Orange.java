package fruit;

/**
 * 具体导出角色：
 * 这个角色实现了抽象导出角色所声明的接口，
 * 工厂方法模式所创建的每一个对象都是某个具体导出角色的实例。
 */
public class Orange extends Fruit {

    @Override
    public void name() {
        System.out.println("orange");
    }
}
