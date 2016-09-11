package visitor;

import node.NodeA;
import node.NodeB;

/**
 * 具体访问者角色：实现抽象访问者所声明的接口，也就是抽象访问者所声明的各个访问操作。
 */
public class VisitorB implements Visitor {

    /**
     * 对应于NodeA的访问操作
     */
    @Override
    public void visit(NodeA node) {
        System.out.println(node.operationA());
    }

    /**
     * 对应于NodeB的访问操作
     */
    @Override
    public void visit(NodeB node) {
        System.out.println(node.operationB());
    }
}
