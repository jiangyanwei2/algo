package pingduoduo;

import java.util.*;

public class Main7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        long left = 0; long right = m * n + 1;
        while (left < right) {
            long mid = left + (right - left) / 2;
            long count = 0;
            int j = m;
            for (int i = 1; i <= n; i++) {

                while (j >= 1 && (long)(i * j) > mid) j--;
                count += (j + 1);
            }
            if (count < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(left);
    }

    public static int getOrder(int n, int m, int val) {
        int row = 1, col = m, order = 0;
        while(row <= m && col >= 1) {
            if((long)(row * col) < val) {
                order += col + 1;
                row++;
            }else {
                col--;
            }
        }
        return order;
    }
}
