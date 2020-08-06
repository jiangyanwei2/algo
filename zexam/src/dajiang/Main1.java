package dajiang;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int X = sc.nextInt();
            int[] bugs = new int[N];
            int sum = 0;
            int res = 0;
            double tmp = 0;
            for (int i = 0; i < N; i++) {
                bugs[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                sum += bugs[i];
            }
            res = (int) Math.ceil(sum * 1.0 / A);
            if (res > X * 60) {
                System.out.println(0);
            } else {
                System.out.println(res);
            }
        }
    }
}
