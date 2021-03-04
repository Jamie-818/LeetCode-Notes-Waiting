import pojo.SolBase;

/**
 * 470. 用 Rand7() 实现 Rand10()
 * https://leetcode-cn.com/problems/implement-rand10-using-rand7/
 * @author jamie
 * @date 2021/3/3 11:41
 */
public class LC470_1 extends SolBase {

    private static int whileNum = 0;

    /**
     * 传统做法
     * 使用公式(randX() - 1) * Y + RandY()不断遍历，可以通过rand7得到rand10
     */
    public int rand10() {
        // 通过公式获取第一个随机值，这个值在0~49之间
        int num = (rand7() - 1) * 7 + rand7();
        // 不停循环
        while(true){
            // 因为我们需要抛弃41~49，如果刚刚好是在41以下，则直接取余返回即可
            if(num <= 40){
                return 1 + num % 10;
            }
            // 如果是41~49，则直接重新根据公式抛硬币
            num = (rand7() - 1) * 7 + rand7();

        }
    }

    public static void main(String[] args) {
        LC470_1 lc470 = new LC470_1();
        long l1 = System.currentTimeMillis();
        for(int i = 0; i < 10000000; i++){
            int i1 = lc470.rand10();
            if(i1 == 0){
                System.out.println(i1);
            }
        }
        // 12250566 遍历多了22%
        System.out.println(System.currentTimeMillis() - l1);
        System.out.println(whileNum);

    }

}
