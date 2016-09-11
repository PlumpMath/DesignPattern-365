package node;

import visitor.Visitor;

/**
 * 抽象节点角色：声明一个接受操作，接受一个访问者对象作为一个参数。
 */
public abstract class Node {

    /**
     * 接收操作
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}
