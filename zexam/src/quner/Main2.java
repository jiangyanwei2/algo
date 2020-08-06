package quner;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int res = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        while (n > 3) {
            int m1 = arr[0] + 2 * arr[1] + arr[n - 1];
            int m2 = 2 * arr[0] + arr[n - 2] + arr[n - 1];
            res += m1 < m2 ? m1 : m2;
            n -= 2;
        }
        if (n == 3) {
            res += arr[0] + arr[1] + arr[2];
        } else if (n == 2) {
            res += arr[1];
        } else {
            res += arr[0];
        }
        System.out.println(res);
    }
}
