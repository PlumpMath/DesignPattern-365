package director;

import builder.Builder;

/**
 * 导演者角色：
 * 担任这个角色的类调用具体建造者角色以创建产品对象。
 * 导演者角色并没有产品类的具体知识，真正拥有产品类的具体知识的是具体建造者角色。
 */
public class Director {

    private Builder mBuilder;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    /**
     * 产品构造方法，负责调用各个零件建造方法
     */
    public void construct() {
        mBuilder.buildPart1();
        mBuilder.buildPart2();
    }
}
