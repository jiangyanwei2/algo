package xueersi;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = 1;
        while (n > 0) {
            res = res << 1;
            n--;
        }
        System.out.println(res);
    }
}
