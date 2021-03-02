import java.util.ArrayList;
import java.util.List;

public class ListIntFactory implements TestHelperFactory<List<Integer>> {

    @Override
    public List<Integer> produce(String s) {
        TestHelperFactory<int[]> factory = new IntArrOneFactory();
        int[] intArr = factory.produce(s);
        return initialList(intArr);
    }

    public List<Integer> initialList(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for(int j: arr){
            res.add(j);
        }
        return res;
    }

}
