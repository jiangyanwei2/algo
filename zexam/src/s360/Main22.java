package s360;

import java.util.Scanner;

public class Main22 {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][] map = new int[n + 1][m + 1];
		int area = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
				if (map[i][j] > 0) {
					area++;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				area += (map[i][j] > 0? 1:0);//上面
				if(j-1 >= 0) area += (map[i][j] > map[i][j-1]? (map[i][j]-map[i][j-1]):0);//左侧
				else area += map[i][j];
				if(j+1 < m) area += (map[i][j] > map[i][j+1]? (map[i][j]-map[i][j+1]):0);//右侧
				else area += map[i][j];
				if(i+1 < n) area += (map[i][j] > map[i+1][j]? (map[i][j]-map[i+1][j]):0);//下侧
				else area += map[i][j];
				if(i-1 >= 0) area += (map[i][j] > map[i-1][j]? (map[i][j]-map[i-1][j]):0);//上侧
				else area += map[i][j];
				}
			}
			System.out.println(area);
		}
}
