/**
 * 832. 翻转图像
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 *
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 *
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/flipping-an-image
 */
class Solution_832_flipping_an_image {

    //1. 水平翻转只需原地互换，只占用常数空间
    //2. 反转图片只需和1进行异或运算
    //3. 1和2的可串行处理，只需遍历一次二维数组

    /**
     * 第一种，翻转和反转分开处理
     */
    public int[][] flipAndInvertImage1(int[][] a) {
        int length = a.length;
        //遍历行
        for(int i = 0; i < length; i++){
            int aiLength = a[i].length;
            // 遍历列 这里因为是对称的，所以需要/2,不然这个反转毫无意义
            for(int y = 0; y < aiLength / 2; y++){
                int temp = a[i][y];
                a[i][y] = a[i][aiLength - y - 1];
                a[i][aiLength - y - 1] = temp;
            }
            // 然后把所有的值与1进行异或运算，得到它们的相反值
            for(int y = 0; y < aiLength; y++){
                a[i][y] = a[i][y] ^ 1;
            }
        }
        return a;
    }

    /**
     * 第二种，翻转和反转同时处理处理
     */
    public int[][] flipAndInvertImage(int[][] a) {
        int length = a.length;
        //遍历行
        for(int i = 0; i < length; i++){
            int aiLength = a[i].length;
            // 遍历列 这里因为是对称的，所以需要/2,不然这个反转毫无意义
            // 顺便把值与1进行异或运算，得到它们的相反值
            for(int y = 0; y < aiLength / 2; y++){
                int temp = a[i][y];
                a[i][y] = a[i][aiLength - y - 1] ^ 1;
                a[i][aiLength - y - 1] = temp ^ 1;
            }
            // 若位数为奇数，单独反转中间位
            if(aiLength % 2 == 1){
                a[i][aiLength / 2] ^= 1;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Solution_832_flipping_an_image solution = new Solution_832_flipping_an_image();
        IntArrTwoFactory intArrTwoFactory = new IntArrTwoFactory();
        int[][] produce = intArrTwoFactory.produce("[[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]");
        PrintUtils.print(produce);
        int[][] ints = solution.flipAndInvertImage(produce);
        PrintUtils.print(ints);

    }

}
