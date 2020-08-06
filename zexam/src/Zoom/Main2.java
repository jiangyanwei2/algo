package Zoom;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] w = new int[N+1];
        int[] l = new int[N+1];
        for (int i = 1; i < N+1; i++) {
            w[i] = sc.nextInt();
            l[i] = sc.nextInt();
        }
        System.out.println(bestVal(w,l,N));
    }

    public static int bestVal (int[] w, int[] l, int N) {
        Integer dp[][] = new Integer[N+1][N+1];
        Arrays.fill(dp, 1);
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N && j != i; j++) {
                if (w[j] > w[i] && l[j] > l[i]) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j] + 1);
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[N][N];
    }
}
