package beikepractice;

import java.util.Scanner;

public class Huafenshuzu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sum = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }
        for (int i = 0; i < n - 1; i++) {
            if (sum[i] == sum[n - 1] - sum[i]) {
                res++;
            }
        }
        System.out.println(res);
    }
}
