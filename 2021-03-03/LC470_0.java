import pojo.SolBase;

/**
 * 470. 用 Rand7() 实现 Rand10()
 * https://leetcode-cn.com/problems/implement-rand10-using-rand7/
 * @author jamie
 * @date 2021/3/3 11:41
 */
public class LC470_0 extends SolBase {

    private static int whileNum = 0;

    /**
     * 优化法，把剩余的随机值再利用，达到最高效率
     * 使用公式(randX() - 1) * Y + RandY()不断遍历，可以通过rand7得到rand10
     */
    public int rand10() {
        int num = (rand7() - 1) * 7 + rand7();
        while(true){
            whileNum++;
            if(num <= 40){
                return 1 + num % 10;
            }
            // 如果来到这里，说明随机数是41~49，经过公式 (num-40-1)可以得到随机数0-8
            // 再使用公式(num - 40 - 1) * 7 + rand7()得到1-63。
            num = (num - 40 - 1) * 7 + rand7();
            if(num <= 60){
                return 1 + num % 10;
            }
            // 此时得到0，1，2  num范围0~21
            num = (num - 60 - 1) * 7 + rand7();
            if(num <= 20){
                return 1 + num % 10;
            }
            // 此时得到0,1 , number范围0~14
            num = (num - 20 - 1) * 7 + rand7();
            if(num <= 10){
                return 1 + num % 10;
            }
            num = (rand7() - 1) * 7 + rand7();
        }
    }

    public static void main(String[] args) {
        LC470_0 lc470 = new LC470_0();
        long l1 = System.currentTimeMillis();
        for(int i = 0; i < 10000000; i++){
            int i1 = lc470.rand10();
            if(i1 > 10 || i1 <= 0){
                System.out.println(i1);
            }
        }
        System.out.println(System.currentTimeMillis() - l1);
        // 10000000
        System.out.println(whileNum);

    }

}
