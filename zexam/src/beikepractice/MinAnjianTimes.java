package beikepractice;

import java.util.Scanner;

public class MinAnjianTimes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int res = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            if (sgn(chars[i]) != sgn(chars[i + 1]) ) {
                res++;
            }
        }
        System.out.println(res+chars.length);

    }

    public static int sgn (char ch) {
        if (Character.isLowerCase(ch)) {
            return 1;
        } else {
            return -1;
        }
    }
}
