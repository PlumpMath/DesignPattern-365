package main;

import composite.Composite;
import composite.Leaf;

public class Main {

    public static void main(String[] args) {

        Composite clothing = new Composite("服装");
        Composite men = new Composite("男装");
        Composite women = new Composite("女装");

        Leaf leaf1 = new Leaf("衬衫");
        Leaf leaf2 = new Leaf("夹克");
        Leaf leaf3 = new Leaf("裙子");
        Leaf leaf4 = new Leaf("套装");

        clothing.addChild(men);
        clothing.addChild(women);
        men.addChild(leaf1);
        men.addChild(leaf2);
        women.addChild(leaf3);
        women.addChild(leaf4);

        clothing.printStruct("");
    }
}
