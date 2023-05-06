package leetcode;

/**
 * @ClassName LeetCode27
 * @Description LeetCode27
 * @Author xiaohuang
 * @Date 5/5/2023 4:47 PM
 * @Version 1.0
 */
public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = 0;
        while(right<nums.length){
            if(val != nums[right]){
                nums[left++] = nums[right];
            }
            right++;
        }
        return left;
    }
}
