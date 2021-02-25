/**
 * 给你一个二维整数数组 matrix， 返回 matrix 的 转置矩阵 。
 * 矩阵的 转置 是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 * @author jamie
 * @date 2021/2/25 15:41
 */
public class Solution_867_transpose_matrix {

    public int[][] transpose(int[][] matrix) {
        // 其实就是把matrix的xy值进行替换，但是要注意在循环里面发生下标越界，一定要先y后i，不然就会下标越界
        int tyLength = matrix[0].length;
        int txLength = matrix.length;
        int[][] transpose = new int[tyLength][txLength];
        for(int i = 0; i < txLength; i++){
            for(int y = 0; y < tyLength; y++){
                transpose[y][i] = matrix[i][y];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        // 实例1
        //        输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
        //        输出：[[1,4,7],[2,5,8],[3,6,9]]
        // 实例2
        //        输入：matrix = [[1,2,3],[4,5,6]]
        //        输出：[[1,4],[2,5],[3,6]]
        String matrix = "[[1,2,3],[4,5,6],[7,8,9]]";
        IntArrTwoFactory intArrTwoFactory = new IntArrTwoFactory();
        int[][] produce = intArrTwoFactory.produce(matrix);
        Solution_867_transpose_matrix transposeMatrix = new Solution_867_transpose_matrix();
        int[][] transpose = transposeMatrix.transpose(produce);
        PrintUtils.print(transpose);

    }

}
