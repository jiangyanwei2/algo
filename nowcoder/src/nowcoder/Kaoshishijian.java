package nowcoder;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Kaoshishijian {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[][] weight = new int[n][2];
        int[][] value = new int[n][2];
        for (int i = 0; i < n; i++) {
            weight[i][0] = sc.nextInt();
            value[i][0] = sc.nextInt();
            weight[i][1] = sc.nextInt();
            value[i][1] = sc.nextInt();
        }
        int[] dp = new int[121];
        for (int i = 0; i < n; i++) {
            for (int j = 120; j >= 0; j--) {
                 if (j >= weight[i][0] && j >= weight[i][1]) {
                     dp[j] = Math.max(dp[j], Math.max(dp[j - weight[i][0]] + value[i][0],dp[j - weight[i][1]] + value[i][1]));
                 } else if (j >= weight[i][0]) {
                     dp[j] = Math.max(dp[j], dp[j - weight[i][0]] + value[i][0]);
                 } else if (j >= weight[i][1]) {
                     dp[j] = Math.max(dp[j], dp[j - weight[i][0]] + value[i][1]);
                 }
            }
        }
        System.out.println(dp[120]);
    }

}
