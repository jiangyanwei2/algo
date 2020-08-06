package beike;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] dp = new int[n];
            Arrays.fill(dp,1);
            for (int i = 0; i < n; i++){
                for(int j = 0; j < i; j++){
                    if (arr[i] > arr[j]){
                        dp[i] = Math.max(dp[i], dp[j]+1);
                    }
                }
            }
            int res = dp[0];
            for (int k = 1; k < dp.length; k++){
                res = Math.max(res, dp[k]);
            }
            System.out.println(res);
        }
    }
}
