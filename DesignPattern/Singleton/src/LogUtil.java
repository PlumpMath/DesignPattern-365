public class LogUtil {

    private static LogUtil logUtil;

    public final int DEBUG = 0;
    public final int INFO = 1;
    public final int ERROR = 2;
    public final int NOTHING = 3;

    public int level = DEBUG;

    private LogUtil() {}

    public static LogUtil getInstance() {
        if (logUtil == null) {
            // 单例模式中获取该实例使用双重锁定更为可靠
            synchronized (LogUtil.class) {
                if (logUtil == null) {
                    logUtil = new LogUtil();
                }
            }
        }
        return logUtil;
    }

    public void debug(String msg) {
        if (level <= DEBUG) {
            System.out.println(msg);
        }
    }

    public void info(String msg) {
        if (level <= INFO) {
            System.out.println(msg);
        }
    }

    public void error(String msg) {
        if (level <= ERROR) {
            System.out.println(msg);
        }
    }
}
