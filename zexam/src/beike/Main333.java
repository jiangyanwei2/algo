package beike;

import java.util.Arrays;
import java.util.Scanner;

public class Main333 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long count = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int[] dp = new int[n];
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] >= 0.9 * arr[i]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
            }
            int res = dp[0];
            for (int k = 1; k < dp.length; k++){
                res = Math.max(res, dp[k]);
            }
            count = (res + 1 )* res;
            System.out.println(count/2);
        }
    }
}
