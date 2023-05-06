package leetcode;

/**
 * @ClassName LeeCode209
 * @Description LeeCode209
 * @Author xiaohuang
 * @Date 5/5/2023 5:15 PM
 * @Version 1.0
 */
public class LeeCode209 {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum =0;//窗口值,保持窗口值大于等于target
        int i= 0;//窗口左边界
        int sublenth =0;//窗口大小

        for(int j=0;j<nums.length;j++){
            sum += nums[j];
            while(sum>=target){
                sublenth = j-i+1;
                result = result<sublenth? result : sublenth;
                sum -=nums[i++];
            }
        }
        return result==Integer.MAX_VALUE?0:result;
    }
}
