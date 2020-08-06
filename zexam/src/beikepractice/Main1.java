package beikepractice;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        int res = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < M; i++) {
            res += maxColNum(arr, i);
        }
        System.out.println(res);
    }

    public static int maxColNum(int[][] arr, int j) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][j] > max) {
                max = arr[i][j];
            }
        }
        return max;
    }
}
