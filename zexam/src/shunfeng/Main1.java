package shunfeng;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] people = new int[n + 1];
        int[] languange = new int[m + 1];
        int res = 0;
        int common = 0;
        for (int i = 0; i < k; i++) {
              people[sc.nextInt()]++;
              languange[sc.nextInt()]++;
        }
        for (int i = 1; i <= m; i++) {
            if (languange[i] != 0) {
                res++;
            }
        }

        for (int i = 1; i <= n ; i++) {
            if (people[i] > 1) {
                common += people[i] - 1;
            }
        }

        res = res - 1 + n - k - common;
        System.out.println(res);
    }
}
