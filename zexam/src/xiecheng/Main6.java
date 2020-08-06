package xiecheng;

import java.util.Scanner;

public class Main6 {

	/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
******************************开始写代码******************************/
	static int DynamicPathPlanning(int[][] matrixGrid) {
		if (matrixGrid == null || matrixGrid.length == 0) {
			return 0;
		}
		int rows = matrixGrid.length;
		int cols = matrixGrid[0].length;
		int [][] dp = new int[rows][cols];
		if (matrixGrid[0][0] == 1 || matrixGrid[rows - 1][cols - 1] == 1) {
			return 0;
		}
		dp[0][0] = 1;
		for (int i = 0; i < rows; i++) {
			if (matrixGrid[i][0] == 0) {
				dp[i][0] = 1;
			} else {
				break;
			}
		}

		for (int j = 0; j < cols; j++) {
			if (matrixGrid[0][j] == 0) {
				dp[0][j] = 1;
			} else {
				break;
			}
		}
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				if (matrixGrid[i][j] == 0) {
					dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
				} else {
					dp[i][j] = 0;
				}
			}
		}
		return dp[rows - 1][cols -1];
	}
	/******************************结束写代码******************************/


	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int res;

		int _matrixGrid_rows = 0;
		int _matrixGrid_cols = 0;
		_matrixGrid_rows = Integer.parseInt(in.nextLine().trim());
		_matrixGrid_cols = Integer.parseInt(in.nextLine().trim());

		int[][] _matrixGrid = new int[_matrixGrid_rows][_matrixGrid_cols];
		for(int _matrixGrid_i=0; _matrixGrid_i<_matrixGrid_rows; _matrixGrid_i++) {
			for(int _matrixGrid_j=0; _matrixGrid_j<_matrixGrid_cols; _matrixGrid_j++) {
				_matrixGrid[_matrixGrid_i][_matrixGrid_j] = in.nextInt();

			}
		}

		if(in.hasNextLine()) {
			in.nextLine();
		}

		res = DynamicPathPlanning(_matrixGrid);
		System.out.println(String.valueOf(res));

	}

}
