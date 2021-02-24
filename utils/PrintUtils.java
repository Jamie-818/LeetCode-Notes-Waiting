/**
 * LeetCode 结果输出器
 * @author jamie
 * @date 2021/2/24 21:00
 */
public class PrintUtils {

    public static void print(int[][] ints) {
        for(int[] anInt: ints){
            for(int i: anInt){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void print(String[][] strs) {
        for(String[] anStr: strs){
            for(String str: anStr){
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }

}
