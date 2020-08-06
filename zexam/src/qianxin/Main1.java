package qianxin;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int[] w = {0, 2, 2, 3, 1, 5, 2};
        int[] v = {0, 2, 3, 1, 5, 4, 3};
        int[][] dp = new int[7][C + 1];
        for (int i = 1; i <= 6 ; i++) {
            for (int j = 0; j <= C ; j++) {
                if (j >= w[i]) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]] + v[i]);
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[6][C]);
    }
}
