public class StringArrFactory implements TestHelperFactory<String[]> {

    @Override
    public String[] produce(String s) {
        String temp1 = s.replace("\"", "");
        String temp2 = temp1.replace("[", "");
        String temp3 = temp2.replace("]", "");
        return temp3.split(",");
    }

}
