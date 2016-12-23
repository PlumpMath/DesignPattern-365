package main;

import node.Node;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 结构对象角色：可以遍历结构中的所有元素；
 * 如果需要，提供一个高层次的接口让访问者对象可以访问每一个元素；
 * 如果需要，可以设计成一个复合对象或者一个聚集，如List或Set。
 */
public class ObjectStructure {

    private List<Node> nodes = new ArrayList<Node>();

    /**
     * 执行方法操作
     * @param visitor
     */
    public void action(Visitor visitor) {

        for (Node node : nodes) {
            node.accept(visitor);
        }
    }

    /**
     * 添加一个新元素
     * @param node
     */
    public void add(Node node) {

        nodes.add(node);
    }
}
