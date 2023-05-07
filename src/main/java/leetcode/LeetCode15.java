package leetcode;

import java.util.*;

/**
 * @ClassName LeetCode15
 * @Description LeetCode15
 * @Author xiaohuang
 * @Date 5/7/2023 6:40 PM
 * @Version 1.0
 */
public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        int left,right;
        for(int i=0;i<nums.length-2;i++){
            left=i+1;
            right=nums.length-1;
            while(left<right){
                int sum = nums[i]+ nums[left]+nums[right];
                if(sum==0){
                    set.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }else if(sum>0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return new ArrayList<List<Integer>>(set);
    }
}
