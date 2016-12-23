/**
 * 适配器类，继承了被适配类，同时实现标准接口
 * 使request()方法封装了specificRequest()
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.specificRequest();
    }
}
