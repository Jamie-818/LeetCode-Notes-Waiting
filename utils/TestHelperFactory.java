/**
 * 工厂接口
 * @author jamie
 * @date 2021/2/24 20:40
 */
public interface TestHelperFactory<T> {

    /**
     * @param s 入参字符串
     */
    T produce(String s);

}