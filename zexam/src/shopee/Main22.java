package shopee;

import java.util.*;

public class Main22 {
    private static final int[] arr = {1, 2, 4, 5, 10, 20};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int[] dp = new int[sum +1];
        Arrays.fill(dp, sum + 1);
        dp[0] = 0;
        for (int i = 1; i <= sum; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - arr[j]] + 1);
                }
            }
        }
        System.out.println(dp[sum]);

    }
}
