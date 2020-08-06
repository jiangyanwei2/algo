package knapsack;

import java.util.*;

public class TwoPartMinSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int[] dp = new int[sum / 2 + 1];
        for (int i = 0; i < n; i++) {
            for (int j = sum / 2; j >= arr[i] ; j--) {
                dp[j] = Math.max(dp[j], dp[j - arr[i]] + arr[i]);
            }
        }
        int res = sum - dp[sum / 2] * 2;
        System.out.println(res);
    }
}
