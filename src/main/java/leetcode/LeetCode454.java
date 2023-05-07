package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode454
 * @Description LeetCode454
 * @Author xiaohuang
 * @Date 5/7/2023 5:38 PM
 * @Version 1.0
 */
public class LeetCode454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map = new HashMap<>();
        int counts=0;
        for(int num1:nums1){
            for(int num2:nums2){
                map.put(num1+num2,map.getOrDefault(num1+num2,0)+1);
            }
        }
        for(int num3:nums3){
            for(int num4:nums4){
                counts += map.getOrDefault(-num3-num4,0);
            }
        }
        return counts;
    }
}
