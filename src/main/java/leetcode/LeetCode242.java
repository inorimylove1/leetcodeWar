package leetcode;

/**
 * @ClassName LeetCode242
 * @Description LeetCode242
 * @Author xiaohuang
 * @Date 5/7/2023 9:59 AM
 * @Version 1.0
 */
public class LeetCode242 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int [] map = new int [26];
        for(int i=0;i<s.length();i++){
            map[s.charAt(i)-'a']++;
            map[t.charAt(i)-'a']--;
        }
        for(int v=0;v<map.length;v++){
            if(map[v]!=0){
                return false;
            }
        }

        return true;
    }
}
