package tencent;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[][] a = new int[n][2];
            int[][] b = new int[n][2];
            for (int j = 0; j < n; j++) {
                a[j][0] = sc.nextInt();
                a[j][1] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                b[j][0] = sc.nextInt();
                b[j][1] = sc.nextInt();
            }
            double min = minDist(a , b);
            System.out.println(String.format("%.3f", min));
        }


    }

    public static double minDist(int[][] a, int[][] b) {
        int n = a.length;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = a[i][0] - b[i][0];
                int y = a[i][1] - b[i][1];
                long dist2 = (a[i][0] - b[j][0]) * (a[i][0] - b[j][0]) + (a[i][1] - b[j][1]) * (a[i][1] - b[j][1]);
                if (dist2 < min) {
                    min = dist2;
                }
            }
        }
        double dist = Math.sqrt(min);
        return dist;
    }
}
