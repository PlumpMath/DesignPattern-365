package builder;

import product.Product;

/**
 * 抽象建造者角色：
 * 给出一个抽象接口，以规范产品对象的各个组成成分的建造。
 * 一般而言，此接口独立于应用程序的商业逻辑。模式中直接创建产品对象的是具体建造者 角色。
 */
public interface Builder {

    public void buildPart1();
    public void buildPart2();
    public Product getResult();
}
