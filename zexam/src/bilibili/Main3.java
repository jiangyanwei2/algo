package bilibili;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] w = new int[N+1];
        int[] v = new int[N+1];
        for (int i = 1; i < N+1; i++) {
            w[i] = sc.nextInt();
        }
        for (int i = 1; i < N+1; i++) {
            v[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(bestVal(w, v, M, N));
    }

    public static int bestVal (int[] w, int[] v, int M, int N) {
        int dp[] = new int[M+1];
        for (int i = 1; i <= N; i++) {
            for (int j = M; j >= w[i]; j--) {

                dp[j] = Math.max(dp[j], dp[j-w[i]] + v[i]);
            }
        }
        return dp[M];
    }
}
