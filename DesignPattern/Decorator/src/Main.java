public class Main {

    public static void main(String[] args) {

        MessageBoardHandler mbh = new MessageBoard();
        String content = mbh.filter("一定要学好装饰模式");
        System.out.println(content);

        mbh = new HtmlFilter(new MessageBoard());
        content = mbh.filter("一定要学好装饰模式");
        System.out.println(content);
    }
}
