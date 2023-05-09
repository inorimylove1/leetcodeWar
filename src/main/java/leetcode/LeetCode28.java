package leetcode;

/**
 * @ClassName LeetCode28
 * @Description LeetCode28
 * @Author xiaohuang
 * @Date 5/8/2023 7:54 PM
 * @Version 1.0
 */
public class LeetCode28 {
    public int strStr(String haystack, String needle) {
        int m = needle.length();
        int n = haystack.length();
        if (m == 0) return 0;
        int[] nxt = new int[m];
        nxt[0] = -1;


        //write next array to store previous where we have same pattern
        //starting from the second item to mth item
        for (int i = 1, j = -1; i < m; i++){
            while(j > -1 && needle.charAt(i) != needle.charAt(j + 1) ){
                j = nxt[j];
            }

            if (needle.charAt(i) == needle.charAt(j + 1)){
                j++;
            }

            nxt[i] = j;
        }


        for (int i = 0, j = -1; i < n; i++){
            while (j > -1 && haystack.charAt(i) != needle.charAt(j + 1)){
                j = nxt[j];
            }

            if (haystack.charAt(i) == needle.charAt(j + 1)){
                j++;
            }

            if (j == m  - 1){
                return i - m +1;
            }
        }

        return -1;
    }
}
