package tencent;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            int k = sc.nextInt();
            query(x, k);
        }
    }

    public static void query(long x, int k) {
        int hight = log2(x);
        if (k >= hight) {
            System.out.println(-1);
        } else {
            int n = hight - k;
            long chu = (long)Math.pow(2, n);
            int res = (int) (x / chu);
            System.out.println(res);
        }
    }

    public static int log2(long x) {
        double tmp = Math.log(x) / Math.log(2);
        int res = (int) tmp;
        return res + 1;
    }
}
