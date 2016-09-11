package iterator;

/**
 * 抽象迭代子角色：此抽象角色定义出遍历元素所需的接口。
 */
public interface Iterator {

    /**
     * 迭代方法：移动到第一个元素
     */
    public void first();

    /**
     * 迭代方法：移动到下一个元素
     */
    public void next();

    /**
     * 迭代方法：是否为最后一个元素
     * @return
     */
    public boolean isDone();

    /**
     * 迭代方法：返还当前元素
     * @return
     */
    public Object currentItem();
}
