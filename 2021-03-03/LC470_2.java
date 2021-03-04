import pojo.SolBase;

/**
 * 470. 用 Rand7() 实现 Rand10()
 * https://leetcode-cn.com/problems/implement-rand10-using-rand7/
 * @author jamie
 * @date 2021/3/3 11:41
 */
public class LC470_2 extends SolBase {

    private static int whileNum = 0;

/**
 * 进阶优化法，把剩余的随机值再利用，达到最高效率
 * 使用公式(randX() - 1) * Y + RandY()不断遍历，可以通过rand7得到rand10
 * 1,2,3,......X(X-1) + Y()
 */
public int rand10() {
    // 通过公式获取第一个随机数
    int num = (rand7() - 1) * 7 + rand7();
    while(true){
        // 如果随机数在40以内，则直接取余返回
        if(num <= 40){
            return 1 + num % 10;
        }
        // 如果来到这里，说明随机数是41~49，直接抛弃十位数套公式
        // 公式 1,2,3,......X(X-1) + Y()    左边的剩余值的0~8 右边则是随机函数
        // 套入公式得到 (num - 40 - 1) * 7 + rand7()
        // 假如 num是41，数值范围是1~7
        // 假如 num是42，数值范围是8~14
        // ...
        // 假如 num是49,数值范围是56~63
        // 所以公式范围得到1~63。
        num = (num - 40 - 1) * 7 + rand7();
        if(num <= 60){
            return 1 + num % 10;
        }
        // 此时剩余值为0，1，2  num范围0~21 原理同上
        num = (num - 60 - 1) * 7 + rand7();
        if(num <= 20){
            return 1 + num % 10;
        }
        // 此时剩余值为0,1 , number范围0~14  原理同上
        num = (num - 20 - 1) * 7 + rand7();
        if(num <= 10){
            return 1 + num % 10;
        }
        // 其实到了这里执行的概率非常低，经测试百亿数据，到下面的概率约等0(测试中没试过);
        num = (rand7() - 1) * 7 + rand7();
    }
}

    public static void main(String[] args) {
        LC470_2 lc470 = new LC470_2();
        long l1 = System.currentTimeMillis();
        int i2 = 100 * 1000 * 1000;
        for(int i = 0; i < i2; i++){
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
