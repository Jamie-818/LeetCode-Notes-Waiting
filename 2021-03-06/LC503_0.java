import lc.LcUtils;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 503. 下一个更大元素 II
 * 给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），输出每个元素的下一个更大元素。数字 x
 * 的下一个更大的元素是按数组遍历顺序，这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。如果不存在，则输出 -1。
 *
 * 链接：https://leetcode-cn.com/problems/next-greater-element-ii
 */
public class LC503_0 {

public int[] nextGreaterElements(int[] nums) {
    int length = nums.length;
    int[] res = new int[length];
    // start
    // 数组填充，默认值为-1
    Arrays.fill(res, -1);
    // 创建一个双端队列用来做单调栈，存储元素的下标
    Deque<Integer> stack = new LinkedList<>();
    // 做两次的循环，用于生成单调栈
    for(int i = 0; i < length * 2 - 1; i++){
        // 获取当前下班，因为双倍数据长度，所以需要用求余获取下标
        int index = i % length;
        // 判断栈顶下标指向的元素是否比当前元素小，如果比当前元素小，则进行出栈
        // 然后进行赋值操作。
        // 当i = 0,index = 0,num = 1的时候，栈的元素应该为[] 下一次循环
        // 当i = 1,index = 1,num = 2的时候，栈的元素应该为[0]
        //  (num[0]=1) < 2 , 则res[0] = 2 出栈 下一次循环
        // 当i = 2,index = 2,num = 1的时候，栈的元素应该为[1]   (num[1]=2) > 1,下一次循环
        // 当i = 3,index = 0,num = 1的时候，栈的元素应该为[2,1] (num[2]=1) = 1 下一次循环
        // 当i = 4,index = 1,num = 2的时候，栈的元素应该为[0,2,1]
        //  (num[0]=1) < 2 , 则res[0] = 2 栈元素 = [2,1]
        //  (num[2]=1) < 2 , 则res[2] = 2 栈元素 = [1]
        //  (num[1]=2) = 2 则下一次循环
        while(!stack.isEmpty() && nums[stack.peek()] < nums[index]){
            Integer arrayIndex = stack.pop();
            res[arrayIndex] = nums[index];
        }
        // push当前下标进stack，并进行下一步操作
        stack.push(index);
    }
    // end
    return res;
}

    public static void main(String[] args) {
        String data = "[1,2,1]";
        int[] oneIntArr = LcUtils.oneIntArrFactory(data);
        LC503_0 lc503 = new LC503_0();
        int[] ints = lc503.nextGreaterElements(oneIntArr);
        for(int anInt: ints){
            System.out.println(anInt);
        }
    }

}
