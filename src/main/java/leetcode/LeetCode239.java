package leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName LeetCode239
 * @Description LeetCode239
 * @Author xiaohuang
 * @Date 5/10/2023 9:21 AM
 * @Version 1.0
 */
public class LeetCode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n =nums.length;
        if(n==0) return nums;
        int[] res = new int[n-k+1];
        Deque<Integer> dq = new LinkedList<>();

        for(int i=0;i<n;i++){
            //step1:头 清理窗口长度范围

            if(!dq.isEmpty()&&dq.getFirst()<(i-k+1)){
                dq.removeFirst();
            }
            //step2:尾 移除尾部小于当前值的元素
            while(!dq.isEmpty()&&nums[i]>=nums[dq.getLast()]){
                dq.removeLast();
            }
            //step:尾部加入
            dq.addLast(i);
            //头从头部获取最大值
            if(i>=k-1){
                res[i-k+1]=nums[dq.getFirst()];
            }

        }
        return res;
    }
}
