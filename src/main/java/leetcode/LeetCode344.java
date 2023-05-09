package leetcode;

/**
 * @ClassName LeetCode344
 * @Description LeetCode344
 * @Author xiaohuang
 * @Date 5/8/2023 10:16 AM
 * @Version 1.0
 */
public class LeetCode344 {
    public void reverseString(char[] s) {
        int left=0;
        int right = s.length-1;
        while(left<right){
            reverse(s,left++,right--);
        }
    }

    private void reverse(char[] s,int left,int right){
        char temp = s[right];
        s[right] = s[left];
        s[left]=temp;
    }
}
