package lc292;

/**
 * 292. Nim 游戏
 * @author jamie
 */
public class lc292_1 {

    /**
     * 如果堆中石头的数量n不能被4整除，那么你总是可以赢的Nim游戏的胜利
     */
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

}
