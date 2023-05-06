package leetcode;

/**
 * @ClassName LeetCode59
 * @Description LeetCode59
 * @Author xiaohuang
 * @Date 5/5/2023 5:47 PM
 * @Version 1.0
 */
public class LeetCode59 {
    public int[][] generateMatrix(int n) {
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int[][] marix = new int[n][n];
        int num = 1;
        int tar = n * n;
        while (num <= tar) {
            //left to right
            for (int i = l; i <= r; i++) {
                marix[t][i] = num++;
            }
            t++;
            //top to bottom
            for (int i = t; i <= b; i++) {
                marix[i][r] = num++;
            }
            r--;
            //right to left
            for (int i = r; i >= l; i--) {
                marix[b][i] = num++;
            }
            b--;
            //bottom to top
            for (int i = b; i >= t; b--) {
                marix[i][l] = num++;
            }
            l++;
        }
        return marix;
    }
}
