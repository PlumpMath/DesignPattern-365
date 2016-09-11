package main;

import node.NodeA;
import node.NodeB;
import visitor.Visitor;
import visitor.VisitorA;

public class Main {

    public static void main(String[] args) {
        //创建一个结构对象
        ObjectStructure os = new ObjectStructure();
        //给结构增加节点
        os.add(new NodeA());
        os.add(new NodeB());
        //创建一个访问者
        Visitor visitor = new VisitorA();
        os.action(visitor);
    }
}
