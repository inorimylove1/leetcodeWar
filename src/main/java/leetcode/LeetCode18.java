package leetcode;

import java.util.*;

/**
 * @ClassName LeetCode18
 * @Description LeetCode18
 * @Author xiaohuang
 * @Date 5/7/2023 7:40 PM
 * @Version 1.0
 */
public class LeetCode18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        int left,right;
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                left=j+1;
                right=nums.length-1;
                while(left<right){
                    int sum = nums[i]+nums[j]+nums[left]+nums[right];

                    if(sum==target){
                        set.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                    }else if(sum>target){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return new ArrayList<List<Integer>>(set);
    }
}
