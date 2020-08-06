package wangyi;

import java.util.Scanner;

public class Main6 {
    private static int steps;
    private static int minSteps = Integer.MAX_VALUE;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            long p = sc.nextInt();
            int q = sc.nextInt();
            dfs(A, B, p, q);
            System.out.println(minSteps);
        }
    }

    public static int solution(long A, long B, long p, int q) {
        int res = 0;
        while (A < B) {
            if (A + p < B) {
                p = p * q;
                res++;
            }else {

            }
        }
        return res;
    }

    public static void dfs(long A, long B, long p, int q) {
        if (A >= B) {
            if (steps < minSteps) {
                minSteps = steps;
            }
            return;
        }
        long tmp1 = A;
        A = A + p;
        steps++;
        dfs(A, B, p, q);
        steps--;
        A = tmp1;
        long tmp2 = p;
        p = p * q;
        steps++;
        dfs(A, B, p, q);
        steps--;
        p = tmp2;
        return;
    }
}
