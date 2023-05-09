package leetcode;

/**
 * @ClassName LeetCode541
 * @Description LeetCode541
 * @Author xiaohuang
 * @Date 5/8/2023 10:16 AM
 * @Version 1.0
 */
public class LeetCode541 {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();

        for(int i=0;i<chars.length;i+=2*k){
            if(i+k-1<=chars.length-1){
                reverse(chars,i,i+k-1);
            }else{
                reverse(chars,i,chars.length-1);
            }
        }
        return new String(chars);
    }

    private void reverse(char[] s,int i,int j){
        while(i<j){
            char tmp=s[j];
            s[j] = s[i];
            s[i] = tmp;
            i++;
            j--;
        }
    }
}
