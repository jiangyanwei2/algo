package wangyi;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            System.out.println(minN(x));
        }
    }

    public static String minN(int x) {
        if (x < 10) {
            return String.valueOf(x);
        }
        int first = x % 9;
        int nums = x / 9;
        StringBuilder sb = new StringBuilder();
        if (first != 0) {
            sb.append(first);
        }
        for (int i = 0; i < nums; i++) {
            sb.append(9);
        }
        return sb.toString();
    }

}
