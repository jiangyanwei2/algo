package wangyi;

import java.util.*;
public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    res[i][j] = 0;
                } else {
                    res[i][j] = dfs(arr, visited, i, j);
                }
            }
        }
        printArray(res);
    }

    public static int dfs(int[][] arr, boolean[][] visited, int i, int j) {
        if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length|| visited[i][j] == true || arr[i][j] == 0) {
            return 0;
        }
        return 1 + dfs(arr, visited, i - 1, j)
                 + dfs(arr, visited, i + 1, j)
                 + dfs(arr, visited, i, j - 1)
                 + dfs(arr, visited, i, j + 1);
    }

    public static void printArray(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == m - 1) {
                    System.out.println(arr[i][j]);
                }else {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
