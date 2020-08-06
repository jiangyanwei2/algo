package migong;

public class UniquePathTwoWithDfs {
    private static int M;
    private static int N;
    private static boolean[][] visited = new boolean[M][N];
    static String path = "";
    static String shortestPath = "";
    static int kind;
    static int pathLength;
    static int minPathLength = Integer.MAX_VALUE;
    public static void dfs(int[][] maze, int x, int y) {
        int rows = maze.length;
        int cols = maze[0].length;
        if (x < 0 || y < 0 || x > rows - 1 || y > cols - 1 || maze[x][y] == 1) {
            return;
        }
        if (x == rows - 1 && y == cols - 1) {
            kind++;
            path = path + "(" + x + "," + y + ")";
            if (pathLength < minPathLength) {
                minPathLength = pathLength;
            }
            if (shortestPath.length() == 0 || shortestPath.length() > shortestPath.length())
                shortestPath = path;
            System.out.println("找到路线:" + path + " " + pathLength);
            return;
        }
        String temp = path;
        path = path + "(" + x + "," + y + ")" + "-"; // 记录路线
        pathLength++;
        maze[x][y] = 1; // 将走过的路标记
        dfs(maze, x + 1, y);
        dfs(maze, x - 1, y);
        dfs(maze, x, y + 1);
        dfs(maze, x, y - 1);
        maze[x][y] = 0;
        pathLength--;
        path = temp;
    }

    public static void main(String[] args) {
        int[][] maze = {{0, 1, 0, 0, 0,},{ 0, 1, 0, 1, 0,},{0, 0, 0, 0, 0,},{0, 1, 1, 1, 0,},{0, 0, 0, 1, 0,}};
        dfs(maze, 0, 0);
        System.out.println(kind);
        System.out.println(minPathLength);
    }
}
