package yuanfudao;

import java.util.Scanner;

public class Main21 {
    private static int[][][] dp;
    private static int[][] map;
    private static int N,M,K;

    private static int[] dx = {-1,1,0,0};
    private static int[] dy = {0,0,-1,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        map = new int[N][M];
        for(int i=0 ; i < N; i++){
            for(int j=0; j < M; j++){
                map[i][j] = sc.nextInt();
            }
        }

        //初始化DP数组
        dp = new int[N][M][K+1];
        for(int i=0; i < N; i++){
            for(int j=0; j < M; j++){
                for(int k=0; k <= K; k++){
                    dp[i][j][k] = -1;
                }
            }
        }

        //遍历所有的情况
        int res = 0;
        for(int i=0; i < N; i++){
            for(int j=0; j < M; j++){
                for(int k=0; k <= K; k++){
                    res = Math.max(res,dfs(i,j,k)+1);
                }
            }
        }

        System.out.println(res);

    }

    private static int dfs(int i,int j, int k){
        //递归终止条件
        if(dp[i][j][k] != -1){
            return dp[i][j][k];
        }

        int ans = 0;
        for(int d=0; d < 4; d++){
            int nx = i + dx[d];
            int ny = j + dy[d];

            if(nx >= 0 && nx < N && ny >= 0 && ny < M){
                if(map[i][j] <= map[nx][ny]){
                    if(k >= 1){
                        ans = Math.max(ans,dfs(nx,ny,k-1)+1);
                    }
                    else{
                        ans = Math.max(ans,0);
                    }
                }
                else{
                    ans = Math.max(ans,dfs(nx,ny,k)+1);
                }
            }
        }

        dp[i][j][k] = ans;
        return ans;
    }
}
