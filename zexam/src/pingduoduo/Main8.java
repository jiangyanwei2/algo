package pingduoduo;

import java.util.*;

public class Main8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        long left = 1; long right = m * n;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long index = count(mid, m, n);
            if (index >= m * n - k + 1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);
    }

    public static long count (long mid, int m, int n) {
        long res = 0;
        for (int i = 1; i <= m ; i++) {
            int tmp = (int)Math.min(mid / i, n);
            res += tmp;
        }
        return res;
    }
}
