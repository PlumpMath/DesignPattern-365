/**
 * 具体装饰角色：负责给构件添加增加的功能。
 */
public class HtmlFilter extends MessageBoardDecorator {

    public HtmlFilter(MessageBoardHandler handler) {
        super(handler);
    }

    @Override
    public String filter(String msg) {
        String temp = super.filter(msg);
        temp += "^^过滤掉HTML标签^^";
        return temp;
    }
}
