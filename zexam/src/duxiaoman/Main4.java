package duxiaoman;

import java.util.Scanner;

public class Main4 {
    public static int res;
    public static int min = 4;
    public static int n;
    public static int a;
    public static int b;
    public static int c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         a = sc.nextInt();
         b = sc.nextInt();
         c = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n ; i++) {
            arr[i] = sc.nextInt();
        }
        dfs(arr, 1);
        System.out.println(min);

    }

    public static void dfs(int[] arr, int i) {
        if (arr[i] == n) {
            if (res < min) {
                min = res;
            }
        } else if (i == n - 1) {
            return;
        }
        //a
        if (i != arr[arr[i]]) {
            res += a;
            dfs(arr, arr[i]);
            res -= a;
        }
        if (arr[i] > 1 && i != arr[arr[i] + 1]) {
            res += b;
            arr[i]++;
            dfs(arr, i);
            arr[i]--;
            res -= b;
        }
        if (arr[i] < n && i != arr[arr[i] - 1]) {
            res += c;
            arr[i]--;
            dfs(arr, i);
            arr[i]++;
            res -= c;
        }
    }


}
