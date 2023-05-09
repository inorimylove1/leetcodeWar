package leetcode;

/**
 * @ClassName LeetCode459
 * @Description LeetCode459
 * @Author xiaohuang
 * @Date 5/9/2023 10:19 AM
 * @Version 1.0
 */
public class LeetCode459 {
    public boolean repeatedSubstringPattern(String str) {
        int l = str.length();
        for(int i=l/2;i>=1;i--) {
            if(l%i==0) {
                int m = l/i;
                String subS = str.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<m;j++) {
                    sb.append(subS);
                }
                if(sb.toString().equals(str)) return true;
            }
        }
        return false;
    }
}
