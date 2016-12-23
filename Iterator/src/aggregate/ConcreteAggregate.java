package aggregate;

import iterator.ConcreteIterator;
import iterator.Iterator;

/**
 * 具体聚集角色：实现了创建迭代子对象的接口，返回一个合适的具体迭代子实例。
 */
public class ConcreteAggregate extends Aggregate {

    private Object[] objArray = null;

    /**
     * 构造方法，传入聚合对象的具体内容
     * @param obj
     */
    public ConcreteAggregate(Object[] obj) {

        objArray = obj;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    /**
     * 取值方法：向外界提供聚集元素
     * @param index
     * @return
     */
    public Object getElement(int index) {

        if (index < objArray.length) {
            return objArray[index];
        } else {
            return null;
        }
    }

    /**
     * 取值方法：向外界提供聚集的大小
     * @return
     */
    public int size() {
        return objArray.length;
    }
}
