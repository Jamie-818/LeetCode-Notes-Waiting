import pojo.SolBase;

/**
 * 470. 用 Rand7() 实现 Rand10()
 * https://leetcode-cn.com/problems/implement-rand10-using-rand7/
 * @author jamie
 */
public class LC470_template extends SolBase {

    public int rand10() {
        return 0;
    }

    public static void main(String[] args) {
        LC470_template lc470 = new LC470_template();
        long l1 = System.currentTimeMillis();
        for(int i = 0; i < 10 * 1000 * 1000; i++){
            int i1 = lc470.rand10();
            if(i1 <= 0 || i1 > 10){
                System.err.println("算法错误，value:" + i1);
            }
        }
        System.out.println("算法使用时间:" + (System.currentTimeMillis() - l1));

    }

}
