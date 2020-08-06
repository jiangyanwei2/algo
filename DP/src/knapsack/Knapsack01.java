package knapsack;

import java.util.Scanner;

public class Knapsack01 {

	public static int bestVal2 (int[] w, int[] v, int C, int N) {
		int dp[][] = new int[N+1][C+1];
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= C; j++) {
				if (j >= w[i]) {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]] + v[i]);
				}else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		return dp[N][C];
	}
	
	public static int bestVal1 (int[] w, int[] v, int C, int N) {
		int dp[] = new int[C+1];
		for (int i = 1; i <= N; i++) {
			for (int j = C; j >= w[i]; j--) {
				
					dp[j] = Math.max(dp[j], dp[j-w[i]] + v[i]);
			}	
		}
		return dp[C];
	}
	//N- 件数，V-容量，w-费用，v-价值
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int V = sc.nextInt();
		int[] w = new int[N+1];
		int[] v = new int[N+1];
		for (int i = 1; i < N+1; i++) {
			w[i] = sc.nextInt();
		}
		for (int i = 1; i < N+1; i++) {
			v[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(bestVal2(w, v, V, N));
	}
}
