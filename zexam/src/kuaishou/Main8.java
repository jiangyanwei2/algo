package kuaishou;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        int[][] fill = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                fill[i][j] = arr[i][j];
            }
        }
        fill(fill);
        int all = count(arr);
        int edge = count(fill);
        int res = all -edge;
        System.out.println(res);
    }

    public static int count(int[][] arr) {
        int res = 0;
        if (arr == null || arr.length == 0){
            return res;
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if (arr[i][j] == 1){
                    dfs(arr, i, j);
                    res++;
                }
            }
        }
        return res;
    }

    public static void dfs(int[][] arr, int i, int j) {
        if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length || arr[i][j] != 1){
            return;
        }
        arr[i][j] = 0;
        dfs(arr, i + 1, j);
        dfs(arr, i - 1, j);
        dfs(arr, i, j + 1);
        dfs(arr, i, j - 1);
    }

    public static void fill(int[][] fill) {
        if (fill.length == 0 || fill[0].length == 0)
            return;
        if (fill.length < 2 || fill[0].length < 2)
            return;
        int m = fill.length, n = fill[0].length;

        for (int i = 0; i < m; i++) {
            if (fill[i][0] == 1)
                boundaryDFS(fill, i, 0);
            if (fill[i][n-1] == 1)
                boundaryDFS(fill, i, n-1);
        }

        for (int j = 0; j < n; j++) {
            if (fill[0][j] == 1)
                boundaryDFS(fill, 0, j);
            if (fill[m-1][j] == 1)
                boundaryDFS(fill, m-1, j);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (fill[i][j] == 1)
                    fill[i][j] = 0;
                else if (fill[i][j] == -1)
                    fill[i][j] = 1;
            }
        }
    }

    public static void boundaryDFS(int[][] arr, int i, int j) {
        if (i < 0 || i > arr.length - 1 || j <0 || j > arr[0].length - 1)
            return;
        if (arr[i][j] == 1)
            arr[i][j] = -1;
        if (i > 1 && arr[i-1][j] == 1)
            boundaryDFS(arr, i-1, j);
        if (i < arr.length - 2 && arr[i+1][j] == 1)
            boundaryDFS(arr, i+1, j);
        if (j > 1 && arr[i][j-1] == 1)
            boundaryDFS(arr, i, j-1);
        if (j < arr[i].length - 2 && arr[i][j+1] == 1 )
            boundaryDFS(arr, i, j+1);
    }
}
