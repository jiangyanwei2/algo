package beikepractice;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeMoney {
    private String[] map = {"0","1","abc","def","ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private static int[] money = {1, 2, 5, 10, 20, 50, 100};
    private static int[] dp = new int[100001];
    static {
        computeCache();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            System.out.println(dp[m]);
        }
    }

    public static void computeCache () {
        int max = 100001;
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i < max; i++) {
            for (int j = 0; j < money.length; j++) {
                if (money[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - money[j]] + 1);
                }
            }
        }
    }
}
