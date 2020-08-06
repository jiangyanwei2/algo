package beikepractice;

import java.util.Scanner;

public class minggong1 {
    static int pathLength;
    static int minPathLength = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        int[][] map = new int[600][600];
        for (int i = 0; i < n; i++) {
            map[sc.nextInt() + 500][sc.nextInt() + 500] = 1;
        }
        dfs(map, 500, 500, x, y);
        System.out.println(minPathLength);
    }
    public static void dfs(int[][] maze, int ox, int oy, int dx, int dy) {
        int rows = maze.length;
        int cols = maze[0].length;
        if (ox < 0 || oy < 0 || ox > rows - 1 || oy > cols - 1 || maze[ox][oy] == 1) {
            return;
        }
        if (ox == dx && oy == dy) {
            if (pathLength < minPathLength) {
                minPathLength = pathLength;

            }
            return;
        }
        pathLength++;
        maze[ox][oy] = 1; // 将走过的路标记
        dfs(maze, ox + 1, oy, dx, dy);
        dfs(maze, ox - 1, oy, dx, dy);
        dfs(maze, ox, oy + 1, dx, dy);
        dfs(maze, ox, oy - 1, dx, dy);
        maze[ox][oy] = 0;
        pathLength--;
    }
}
