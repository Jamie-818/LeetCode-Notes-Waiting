/**
 * 一维数组工厂
 * @author jamie
 * @date 2021/2/24 20:17
 */
public class IntArrOneFactory implements TestHelperFactory<int[]> {

    @Override
    public int[] produce(String s) {
        String temp1 = s.replace("[", "");
        String temp2 = temp1.replace("]", "");
        if(temp2.length() == 0){
            return new int[0];
        }
        String[] s2 = temp2.split(",");
        int n = s2.length;
        int[] res = new int[n];
        for(int i = 0; i < n; ++i){
            res[i] = Integer.parseInt(s2[i]);
        }
        return res;
    }

}