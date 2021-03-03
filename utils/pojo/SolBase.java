package pojo;

/**
 * @author jamie
 * @date 2021/3/3 15:00
 */
public class SolBase {

    public int rand7() {
        return getNum(1, 7);
    }

    public static int getNum(int start, int end) {
        return (int)(Math.random() * (end - start + 1) + start);
    }

}
