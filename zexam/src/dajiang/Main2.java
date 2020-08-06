package dajiang;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int N = sc.nextInt();
            int T = sc.nextInt();
            int[] dp = new int[T + 1];
            for (int i = 0; i < N; i++) {
                int v = sc.nextInt();
                int l = sc.nextInt();
                int c = sc.nextInt();
                for (int j = T; j >= 0 ; j--) {
                    for (int k = 0; k <= c && k * v <= j ; k++) {
                        dp[j] = dp[j] > dp[j-k * v]+ k * l ? dp[j] : dp[j-k * v]+k*l;
                    }
                }
            }
            System.out.println(dp[T]);
        }
    }
}
