import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂角色 ：本角色负责创建和管理享元角色。本角色必须保证享元对象可以被系统适当地共享。
 * 当一个客户端对象调用一个享元对象的时候，享元工厂角色会检查系统中是否已经有一个符合要求的享元对象。
 * 如果已经有了，享元工厂角色就应当提供这个已有的享元对象；
 * 如果系统中没有一个适当的享元对象的话，享元工厂角色就应当创建一个合适的享元对象。
 */
public class FlyweightFactory {

    private Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();

    public Flyweight factory(Character state) {
        //先从缓存中查找对象
        Flyweight fly = files.get(state);
        if (fly == null) {
            fly = new ConcreteFlyweight(state);
            files.put(state, fly);
        }
        return fly;
    }
}
