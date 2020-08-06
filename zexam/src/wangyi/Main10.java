package wangyi;
/*
* 3 50
* 100 50 51
* 1000 1000 1000
* */
import java.util.*;
public class Main10 {
    public static void main(String[] args) {
//        int[][] arr = {
//                {100,1000},
//                {50,1000},
//                {51,1000}
//        };
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int n = sc.nextInt();
        int D = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n ; i++) {
            arr[i][0] = sc.nextInt();
        }
        for (int i = 0; i < n ; i++) {
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if(a[0] == b[0]) {
                    return a[1] - b[1];
                }else {
                    return a[0] - b[0];
                }
            }
        });
        for (int i = 0; i < n; i++) {
            if (D >= arr[i][0]) {
                D++;
            }else{
                res += arr[i][1];
            }
        }
        System.out.println(res);
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
