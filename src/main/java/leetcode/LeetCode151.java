package leetcode;

/**
 * @ClassName LeetCode151
 * @Description LeetCode151
 * @Author xiaohuang
 * @Date 5/8/2023 7:43 PM
 * @Version 1.0
 */
public class LeetCode151 {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        for(int start = s.length()-1; start >=0 ; start--) {
            if(s.charAt(start)==' '){
                continue;
            }
            int end=start;
            while(start>=0 && s.charAt(start)!=' '){
                start--;
            }
            ans.append(s.substring(start+1,end+1)).append(" ");
        }
        return ans.toString().trim();
    }
}
