package s360;

import java.util.HashSet;
import java.util.Scanner;

public class SanBu1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] path = new int [M];
        int res = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < M; i++) {
            path[i] = sc.nextInt();
        }
        for (int i = 1; i <= N; i++) {
            dfs2(path, i, 0, N,set);
        }
        System.out.println(set.size());

    }

    public static boolean dfs(int[] arr, int pos, int len, int N) {
        if (pos > N || pos < 1) return false;
        if (len == arr.length) return true;
        return dfs(arr, pos + arr[len], len + 1, N) ||
        dfs(arr, pos - arr[len], len + 1, N);
    }

    public static void dfs2(int[] arr, int pos, int len, int N, HashSet<Integer> set) {
        if (pos >= 1 && pos <= N) {
            if (len == arr.length) {
                set.add(pos);
                return;
            }
            dfs2(arr, pos + arr[len], len + 1, N, set);
            dfs2(arr, pos - arr[len], len + 1, N, set);

        }

        return;

    }


}
