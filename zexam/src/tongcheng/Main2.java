package tongcheng;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                dp[i] = dp[i -  1] + 1;
            } else {
                dp[i] = 1;
            }
        }

        for(int i = n - 2;i >= 0;i--){
            if(arr[i] > arr[i + 1]&&dp[i]<=dp[i + 1]){
                dp[i] = dp[i + 1] + 1;
            }
        }
        for(int i : dp){
            res += i;
        }
        System.out.println(res);

    }
}
