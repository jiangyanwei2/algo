package s360;

import java.util.*;

public class Main2 {
	private static int[][] direct = {{-1,0},{1,0},{0,-1},{0,1}};
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][] map = new int[n + 1][m + 1];
		int area = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				map[i][j] = sc.nextInt();
				if (map[i][j] > 0) {
					area++;
				}
			}
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				for (int k = 0; k < 4; k++) {
					int x = i + direct[k][0];
					int y = j + direct[k][1];

					if (x > 0 && x <= n && y > 0 && y <=m && map[i][j] > map[x][y]) {
						area += map[i][j] - map[x][y];
					}
				}
			}
			System.out.println(area);
		}

	}

}
