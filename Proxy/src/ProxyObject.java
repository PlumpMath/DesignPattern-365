/**
 * 代理对象角色
 */
public class ProxyObject extends AbstractObject {

    @Override
    public void operation() {

        System.out.println("before");
        RealObject realObject = new RealObject();
        realObject.operation();
        System.out.println("after");
    }
}
