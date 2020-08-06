package Array;

import java.util.*;

public class qianzhuihe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sum = new int[n];
        sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }
        int L = sc.nextInt();
        int R = sc.nextInt();
        int res = sum[R] - sum[L - 1];
        System.out.println(res);

    }
}
