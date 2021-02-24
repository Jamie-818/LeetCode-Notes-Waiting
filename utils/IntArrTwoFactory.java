import java.util.LinkedList;
import java.util.Queue;

/**
 * 二维数组工厂
 * @author jamie
 * @date 2021/2/24 20:18
 */
public class IntArrTwoFactory implements TestHelperFactory<int[][]> {

    @Override
    public int[][] produce(String s) {
        Queue<int[]> queue = new LinkedList<int[]>();
        s = s.substring(0, s.length() - 1);
        s = s.substring(1, s.length());
        int maxM = 0;
        TestHelperFactory<int[]> factory = new IntArrOneFactory();
        while(s.length() > 0){
            int b = s.indexOf("[");
            int e = s.indexOf("]");
            String temp = s.substring(b, e + 1);
            int[] intArr = factory.produce(temp);
            maxM = Math.max(intArr.length, maxM);
            queue.add(intArr);
            s = s.substring(e + 1, s.length());
        }
        int m = maxM;
        int n = queue.size();
        int[][] res = new int[n][m];
        for(int i = 0; i < n; ++i){
            res[i] = queue.poll();
        }
        return res;
    }

}
