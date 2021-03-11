package lc557;

public class lc557_2 {

    /**
     * 逐个单词处理
     * 时间复杂度 O(N)
     * 空间复杂度 O(N)
     * @param s 字符串
     */
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        // 单词开始处理锚点
        int i = 0;
        // 处理中单词末尾锚点
        int j = 0;
        // 如果 i没到最后，说明还没处理好
        while(i < arr.length){
            int start = i;
            int end = i - 1;
            // 计算当前单词的末尾下标
            for(j = i; j < arr.length; j++){
                if(arr[j] == ' '){
                    //  如果空字符串的话，到达单词尾，跳出循环
                    break;
                }
                end = end + 1;
            }
            // 进行单词前后交换
            while(start < end){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            // 跳出循环后，处理下一个单词
            i = j + 1;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        lc557_2 lc557 = new lc557_2();
        String result = lc557.reverseWords(s);
        System.out.println(result);
        String yesResult = "s'teL ekat edoCteeL tsetnoc";
        System.out.println(yesResult);
        System.out.println(yesResult.equals(result));
    }

}
