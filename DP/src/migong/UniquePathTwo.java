package migong;
// 只能向右或向下！！！！！！！
public class UniquePathTwo {
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0){
            return 0;
        }
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        int [][] dp = new int[rows][cols];
        if (obstacleGrid[0][0] == 1 || obstacleGrid[rows - 1][cols - 1] == 1){
            return 0;
        }
        dp[0][0] = 1;
        //首列有0的地方都初始化为1
        for (int i = 0; i < rows; i++){
            if (obstacleGrid[i][0] == 0){
                dp[i][0] = 1;
            }else{
                break;
            }
        }
        //首行有0的地方都初始化为1
        for (int j = 0; j < cols; j++){
            if (obstacleGrid[0][j] == 0){
                dp[0][j] = 1;
            }else{
                break;
            }
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
	public static void main(String[] args) {
		int[][] map = {{0, 1, 0, 0, 0,},{ 0, 1, 0, 1, 0,},{0, 0, 0, 0, 0,},{0, 1, 1, 1, 0,},{0, 0, 0, 1, 0,}};//{{0,0,0},{0,1,0},{0,0,0}};
		int res = uniquePathsWithObstacles(map);
		System.out.println(res);
		
	}

}
