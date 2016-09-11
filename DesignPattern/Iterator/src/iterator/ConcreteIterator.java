package iterator;

import aggregate.ConcreteAggregate;

/**
 * 具体迭代子角色：此角色实现了Iterator接口，并保持迭代过程中的游标位置。
 */
public class ConcreteIterator implements Iterator {

    //持有被迭代的具体的聚合对象
    private ConcreteAggregate mAgg;
    //内部索引，记录当前迭代到的索引位置
    private int mIndex = 0;
    //记录当前聚集对象的大小
    private int mSize = 0;

    public ConcreteIterator(ConcreteAggregate agg) {
        mAgg = agg;
        mSize = agg.size();
        mIndex = 0;
    }

    /**
     * 迭代方法：返还当前元素
     */
    @Override
    public Object currentItem() {
        return mAgg.getElement(mIndex);
    }

    /**
     * 迭代方法：移动到第一个元素
     */
    @Override
    public void first() {
        mIndex = 0;
    }

    /**
     * 迭代方法：是否为最后一个元素
     */
    @Override
    public boolean isDone() {
        return (mIndex >= mSize);
    }

    /**
     * 迭代方法：移动到下一个元素
     */
    @Override
    public void next() {

        if (mIndex < mSize) {
            mIndex++;
        }
    }
}
