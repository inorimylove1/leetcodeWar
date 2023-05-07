package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName LeetCode349
 * @Description LeetCode349
 * @Author xiaohuang
 * @Date 5/7/2023 10:16 AM
 * @Version 1.0
 */
public class LeetCode349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet();
        List<Integer> arr= new ArrayList();
        for(int num1:nums1){
            set.add(num1);
        }
        for(int num2:nums2){
            if(set.contains(num2)){
                arr.add(num2);
                set.remove(num2);
            }
        }
        int [] result = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            result[i] = arr.get(i);
        }
        return result;

    }
}
