package wangyi;

import java.util.*;

public class Main7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(lenofLIS(arr));
        }
    }

    public static int lenofLIS(int[] arr) {
        int n = arr.length;
        int res = 0;
        int count = 0;
        long[] sum = new long[n];
        sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }
        for (int i = 0; i < n; i++) {
           if (arr[i] >= sum[i] - arr[i]) {
               count++;
               res = Math.max(res, count);
           } else {
               count = 1;
           }
        }
        return res;
    }
}
