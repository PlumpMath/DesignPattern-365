/**
 * 目标对象角色：定义了代理对象所代表的目标对象。
 */
public class RealObject extends AbstractObject {

    @Override
    public void operation() {
        System.out.println("一些操作");
    }
}
