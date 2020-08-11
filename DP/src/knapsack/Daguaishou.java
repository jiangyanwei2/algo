package knapsack;

/**
 https://blog.csdn.net/wwxy1995/article/details/89099880
 */
/**
 * in
 * 3
 * 8 5 10
 * 1 1 2
 * out
 * 2
 * */

import java.util.Arrays;
import java.util.Scanner;

/**
 * in
 * 4
 * 1 2 4 8
 * 1 2 1 2
 * out
 * 6
 * */
public class Daguaishou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n + 1];
        int[] p = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            d[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextInt();
        }
        System.out.println(bestVal(d, p));
    }

    public static int bestVal(int[] d, int[] p) {
        int n = d.length - 1;
        //第i个怪兽，用j个金币买时的最大武力值
        int[][] dp = new int[n + 1][2 * n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                dp[i][j] = -1;
            }
        }
        dp[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 2 * n; j++) {
                if (j >= p[i] && dp[i][j - p[i]] != -1) {
                    dp[i][j] = dp[i - 1][j - p[i]] + d[i];
                }
                if (dp[i - 1][j] != -1 && dp[i - 1][j] >= d [i]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                }
            }
        }
        int res = 0;
        for (int j = 1; j <= 2 * n; j++) {
            if (dp[n][j] != -1) {
                res = j;
                break;
            }
        }
        return res;
    }
}
