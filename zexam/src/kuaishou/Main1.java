package kuaishou;

import java.util.*;
public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int threshold = sc.nextInt();
		int res = movingCount(rows, cols, threshold);
		System.out.println(res);
	}
	
	public static int movingCount( int rows, int cols, int threshold)
    {
        if(threshold < 0 || rows < 0 || cols < 0)
            return 0;
        boolean[][] visited = new boolean[rows][cols];
        return helper(threshold,rows,cols,0,0,visited);
    }
    
    private static int helper(int threshold, int rows, int cols, int i, int j, boolean[][] visited)
    {
        if(i < 0 || i >= rows || j < 0 || j >= cols || getSum(i)+getSum(j) > threshold || visited[i][j] == true)
            return 0;
        visited[i][j] = true;
        return 1 + helper(threshold,rows,cols,i-1,j,visited)
                 + helper(threshold,rows,cols,i+1,j,visited)
                 + helper(threshold,rows,cols,i,j-1,visited)
                 + helper(threshold,rows,cols,i,j+1,visited);
        
    }
    
    private static int getSum(int num){
        int sum = 0;
        while(num > 0){
            sum +=num%10;
            num = num/10;
        }
        return sum;
    }

}
