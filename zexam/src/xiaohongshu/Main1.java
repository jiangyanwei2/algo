package xiaohongshu;

import java.util.*;

public class Main1 {
    static int pathLength;
    static int minPathLength = Integer.MAX_VALUE;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] map = new int[n][m];
        for (int i = 0; i < k; i++) {
            map[sc.nextInt()][sc.nextInt()] = 1;
        }
        dfs(map, 0, 0);
        if (minPathLength == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minPathLength);
        }
    }

    public static void dfs(int[][] map, int x, int y) {
        int rows = map.length;
        int cols = map[0].length;
        if (x < 0 || y < 0 || x > rows - 1 || y > cols - 1 || map[x][y] == 1) {
            return;
        }
        if (x == rows - 1 && y == cols - 1) {
            if (pathLength < minPathLength) {
                minPathLength = pathLength;
            }
            return;
        }
        pathLength++;
        map[x][y] = 1; // 将走过的路标记
        dfs(map, x + 1, y);
        dfs(map, x - 1, y);
        dfs(map, x, y + 1);
        dfs(map, x, y - 1);
        map[x][y] = 0;
        pathLength--;
    }
}
