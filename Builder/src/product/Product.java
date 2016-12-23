package product;

/**
 * 产品角色：
 * 产品便是建造中的复杂对象。一般来说，一个系统中会有多于一个的产品类，
 * 而且这些产品类并不一定有共同的接口，而完全可以是不相关联的。
 */
public class Product {

    private String mPart1;
    private String mPart2;

    public void setPart1(String part1) {
        mPart1 = part1;
    }

    public void setPart2(String part2) {
        mPart2 = part2;
    }

    public String getPart1() {
        return mPart1;
    }

    public String getPart2() {
        return mPart2;
    }
}
