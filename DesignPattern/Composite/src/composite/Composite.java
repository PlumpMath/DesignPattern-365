package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    /**
     * 用来储存组合对象中包含的子组件对象
     */
    private List<Component> mChildComponents = new ArrayList<Component>();

    /**
     * 组合对象的名字
     */
    private String mName;

    /**
     * 构造方法，传入组合对象的名字
     * @param name 组合对象的名字
     */
    public Composite(String name) {
        mName = name;
    }

    /**
     * 聚集管理方法，增加一个子构件对象
     * @param child 子构件对象
     */
    public void addChild(Component child) {
        mChildComponents.add(child);
    }

    /**
     * 聚集管理方法，删除一个子构件对象
     * @param index 子构件对象的下标
     */
    public void removeChild(int index) {
        mChildComponents.remove(index);
    }

    /**
     * 聚集管理方法，返回所有子构件对象
     */
    public List<Component> getChild() {
        return mChildComponents;
    }

    /**
     * 输出对象的自身结构
     * @param preStr 前缀，主要是按照层级拼接空格，实现向后缩进
     */
    @Override
    public void printStruct(String preStr) {
        //先把自己输出
        System.out.println(preStr + "+" + mName);
        //如果还包含有子组件，那么就输出这些子组件对象
        if (mChildComponents != null) {
            //添加两个空格，表示向后缩进两个空格
            preStr += "  ";
            //输出当前对象的子对象
            for (Component c : mChildComponents) {
                c.printStruct(preStr);
            }
        }
    }
}