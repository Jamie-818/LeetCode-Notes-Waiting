import java.util.ArrayList;
import java.util.List;

public class ListListIntFactory implements TestHelperFactory<List<List<Integer>>> {

    @Override
    public List<List<Integer>> produce(String s) {
        TestHelperFactory<int[][]> factory = new IntArrTwoFactory();
        int[][] intArr = factory.produce(s);
        return initialList(intArr);
    }

    private List<List<Integer>> initialList(int[][] arr) {
        List<List<Integer>> res = new ArrayList<>();
        ListIntFactory factory = new ListIntFactory();
        for(int[] temp: arr){
            List<Integer> l = factory.initialList(temp);
            res.add(l);
        }
        return res;
    }

}
