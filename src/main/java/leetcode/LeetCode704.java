package leetcode;

/**
 * @ClassName LeetCode704
 * @Description LeetCode704
 * @Author xiaohuang
 * @Date 5/5/2023 4:30 PM
 * @Version 1.0
 */
public class LeetCode704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                left = mid + 1;
            }
            if(nums[mid] > target){
                right = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LeetCode704 code704 = new LeetCode704();
        int[] nums = new int[]{-1,0,3,5,9,12};
        code704.search(nums,9);
    }
}
