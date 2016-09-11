package aggregate;

import iterator.Iterator;

/**
 * 聚集角色：此抽象角色给出创建迭代子对象的接口。
 */
public abstract class Aggregate {

    /**
     * 工厂方法，创建相应迭代子对象的接口
     * @return
     */
    public abstract Iterator createIterator();
}
