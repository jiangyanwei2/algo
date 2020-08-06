package tencent;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        double x = 10e18;
        System.out.println(log2(x));
        long chu = (long)Math.pow(2, 64);
        System.out.println((int)1.5);
    }
    public static int log2(double x) {
        double tmp = Math.log(x) / Math.log(2);
        int res = (int) tmp;
        return res + 1;
    }

}
