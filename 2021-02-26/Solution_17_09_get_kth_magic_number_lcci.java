import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * 有些数的素因子只有 3，5，7，请设计一个算法找出第 k 个数。注意，不是必须有这些素因子，而是必须不包含其他的素因子。例如，前几个数按顺序应该是 1，3，5，7，9，15，21。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/get-kth-magic-number-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 示例 1:
 * 输入: k = 5
 * 输出: 9
 * @author jamie
 * @date 2021/2/25 16:26
 */
public class Solution_17_09_get_kth_magic_number_lcci {

    public int getKthMagicNumber(int k) {
        // 新建一个优先队列
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();
        //插入初始值
        priorityQueue.add(1L);
        // 使用一个HashSet来存储值
        Set<Long> longs = new HashSet<>();
        while(true){
            // 获取队首元素
            Long val = priorityQueue.poll();
            // 判断hashSet里面是否已经有该元素
            if(!longs.contains(val)){
                longs.add(val);
                // 最先放进去的最先出来
                priorityQueue.add(val * 3);
                priorityQueue.add(val * 5);
                priorityQueue.add(val * 7);
            }
            // 如果k是指定的数，则直接返回
            if(longs.size() == k){
                return val.intValue();
            }
        }
    }

    public int getKthMagicNumber2(int k) {
        // 新建一个优先队列
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();
        //插入初始值
        priorityQueue.add(1L);
        // 使用一个long来存储最后的值
        long currValue = 0;
        // 使用下标来判断到达的位置
        int index = 0;
        while(true){
            // 获取队首元素
            Long val = priorityQueue.poll();
            // 当上次循环拿出来的队首元素小于当次队首元素，才需要替换值。
            if(currValue < val){
                currValue = val;
                priorityQueue.add(val * 3);
                priorityQueue.add(val * 5);
                priorityQueue.add(val * 7);
                index++;
            }
            if(index == k){
                return val.intValue();
            }
        }
    }

    public static void main(String[] args) {
        Solution_17_09_get_kth_magic_number_lcci solution = new Solution_17_09_get_kth_magic_number_lcci();
        int i = solution.getKthMagicNumber2(5);
        System.out.println(i);
    }

}
