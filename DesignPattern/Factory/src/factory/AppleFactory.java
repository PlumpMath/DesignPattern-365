package factory;

import fruit.Apple;
import fruit.Fruit;

/**
 * 具体工厂角色：
 * 担任这个角色的是实现了抽象工厂接口的具体JAVA类。
 * 具体工厂角色含有与业务密切相关的逻辑，并且受到使用者的调用以创建导出类.
 */
public class AppleFactory extends FruitFactory {

    @Override
    public Fruit create() {
        return new Apple();
    }
}
