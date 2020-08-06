package huawei;

import java.util.*;

public class Main1 {
	public static int[] kind = {4,9};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(minBox(n));
	}

	public static int minBox(int n) {
        int max = n + 1;
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < kind.length; j++) {
                if (kind[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - kind[j]] + 1);
                }
            }
        }
        return dp[n] > n ? -1 : dp[n];
    }

}
