package yuanfudao;

import java.util.*;
/*
* 3 3 1
* 1 3 3
* 2 4 9
* 8 9 2
* */

public class Main2 {
    private static int[] dx = {-1,1,0,0};
    private static int[] dy = {0,0,1,-1};
    private static int[][] arr;
    private  static int[][][] dp;
    private static int N;
    private static int M;
    private static int K;

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        arr = new int[N][M];
        int res = 0;
        for (int i = 0; i < N; i++) {
        	for (int j = 0; j < M; j++) {
        		arr[i][j] = sc.nextInt();
        	}
        }
        dp = new int[N][M][K + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k <= K; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k <= K; k++) {
                    res = Math.max(res, dfs(i,j,k) + 1);
                }
            }
        }
        System.out.println(res);
    }

    public static int dfs (int x, int y, int k) {
	    if (dp[x][y][k] != -1) return dp[x][y][k];
        dp[x][y][k] = 1;
	    int res = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                if (arr[x][y] <= arr[nx][ny]) {
                    if (k > 0) {
                        res = Math.max(res, dfs(nx, ny, k - 1) + 1);
                    } else {
                        res = Math.max(res, 0);
                    }

                } else {
                    res = Math.max(res, dfs(nx, ny, k) + 1);
                }
            }
        }
        return dp[x][y][k] = res;
    }
}
