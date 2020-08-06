package knapsack;

import java.util.Scanner;

public class Kanpsackyilai {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int m = sc.nextInt();
        int[] v = new int[m + 1];
        int[] p = new int[m + 1];
        int[] q = new int[m + 1];
        for (int i = 1; i <= m; i++) {
            v[i] = sc.nextInt();
            p[i] = sc.nextInt() * v[i];
            q[i] = sc.nextInt();
            
        }
        System.out.println(getMaxValue(v,p,q,N,m));
        
    }
    
    private static int getMaxValue(int[] v, int[] p, int[] q, int N, int m) {
        int[][] dp = new int[m + 1][N + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= N; j++) {
                if (q[i] == 0) {
                    if (v[i] <= j) {
                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-v[i]] + p[i]);
                    }
                }else{
                    if (v[i] + v[q[i]] <= j) {
                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-v[i]-v[q[i]]] + p[i]+p[q[i]]);
                    }
                }
            }
        }
        return dp[m][N];
    }

}
