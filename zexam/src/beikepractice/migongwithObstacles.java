package beikepractice;

import java.util.Scanner;

public class migongwithObstacles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt() + 1;
        int cols = sc.nextInt() + 1;
        int n = sc.nextInt();
        int[][] map = new int[rows][cols];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            map[x][y] = 1;
        }
        System.out.println(uniquePathsWithObstacles(map));

    }
    public static long uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0){
            return 0;
        }
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        long [][] dp = new long[rows][cols];
        if (obstacleGrid[0][0] == 1){
            return 0;
        }
        dp[0][0] = 1;
        //首列有1的地方都初始化为0
        for (int i = 0; i < rows; i++) {
            dp[i][0] = 1;
        }
        //首行有1的地方都初始化为0
        for (int j = 0; j < cols; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < rows; i++){
            for (int j = 1; j < cols; j++){
                if (obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                }else{
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[rows - 1][cols -1];
    }
}
