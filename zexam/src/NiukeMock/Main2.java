package NiukeMock;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[][] arr = new boolean[1001][1001];
		int[][] num = new int[1001][1001];
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = true;
		}
		for (int i = 1; i < 1001; i++) {
	        for (int j = 1; j < 1001; j++) {
	          num[i][j] = (arr[i][j] ? 1 : 0 )+ num[i][j - 1] + num[i - 1][j] - num[i - 1][j - 1];
	        }
	    }
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int res = num[x2][y2] - num[x2][y1 - 1] - num[x1 - 1][y2] + num[x1 - 1][y1 - 1];
			System.out.println(res);
		}
	}
 
}
