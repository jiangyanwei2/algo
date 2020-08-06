package knapsack;

import java.util.Scanner;

public class MultipleKnapsack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int N = sc.nextInt();       //件数
            int T = sc.nextInt();       //容量
            int[] dp = new int[T + 1];
            for (int i = 0; i < N; i++) {
                int v = sc.nextInt();   //费用
                int l = sc.nextInt();   //价值
                int c = sc.nextInt();   //件数
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
