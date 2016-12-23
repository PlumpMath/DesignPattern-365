package node;

import visitor.Visitor;

/**
 * 具体节点角色：实现了抽象节点所规定的接受操作。
 */
public class NodeB extends Node {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "NodeB";
    }
}
