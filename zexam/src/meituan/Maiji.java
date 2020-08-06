package meituan;

import java.util.Scanner;

public class Maiji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n / 5; i++) {
            for (int j = 0; j <= n / 10; j++) {
                for (int k = 0; k <= n / 25; k++) {
                    if (5 * i + 10 * j + 25 * k == n) {
                        System.out.println(i + " " + j + " " + k + " ");
                    }
                }
            }
        }
    }
}
