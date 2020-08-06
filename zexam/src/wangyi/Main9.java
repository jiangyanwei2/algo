package wangyi;

import java.util.*;
public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean noRes = false;
        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long res = getK(arr);
        System.out.println(res);
    }

    public static long getK(long[] arr) {
        int n = arr.length;
        long[] diff = new long[n - 1];
        for(int i = n - 1; i > 0; i--) {
            diff[i - 1] = arr[i] - arr[i - 1];
        }
        Arrays.sort(diff);
        if (diff[0] <= 0) {
            return -1;
        }
        while (diff[0] != diff[diff.length - 1]) {
            for (int i = diff.length - 1; i > 0; i--) {
                if (diff[i] % diff[i - 1] == 0) {
                    diff[i] = diff[i - 1];
                } else {
                    diff[i] = diff[i] % diff[i - 1];
                }
            }
            Arrays.sort(diff);
        }
        return diff[0];
    }
}
