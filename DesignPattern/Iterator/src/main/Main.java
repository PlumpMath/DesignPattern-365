package main;

import aggregate.Aggregate;
import aggregate.ConcreteAggregate;
import iterator.Iterator;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.operation();
    }

    public void operation() {

        Object[] objArray = {"One","Two","Three","Four","Five","Six"};
        //创建聚合对象
        Aggregate agg = new ConcreteAggregate(objArray);
        //循环输出聚合对象中的值
        Iterator it = agg.createIterator();
        while(!it.isDone()){
            System.out.println(it.currentItem());
            it.next();
        }
    }
}
