package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode1
 * @Description LeetCode1
 * @Author xiaohuang
 * @Date 5/7/2023 10:39 AM
 * @Version 1.0
 */
public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> maps = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(maps.containsKey(target-nums[i])){
                return new int[]{maps.get(target-nums[i]),i};
            }else{
                maps.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
