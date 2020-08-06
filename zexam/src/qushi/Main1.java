package qushi;

import java.util.*;
//1234567890123456789012345678901234567890.1234567890123456789012345678901234567890
//1000000000100000000010000000001000000000.1000000000100000000010000000001000000000
//
public class Main1 {
    private static String add(String num1, String num2)
    {
        if(hasDot(num1) && !hasDot(num2)) {
            num2 += ".0";
        }
        else if (!hasDot(num1) && hasDot(num2)){
            num1 += ".0";
        }
        else if (!hasDot(num1) && !hasDot(num2)) {
            num1 += ".0";
            num2 += ".0";
        }

        int num1DotIndex = num1.lastIndexOf(".");
        int num2DotIndex = num2.lastIndexOf(".");
        return null;

    }

    // please don't modify any code below.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        String sum = add(num1, num2);
        System.out.println(sum);
    }

    private static boolean hasDot(String str){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                return true;
            }
        }
        return false;
    }

    private static String delTailZero(String str) {
        while (str.charAt(str.length() - 1) == '0') {
            str = str.substring(0, str.length() - 1);
        }
        if (str.charAt(str.length() - 1) == '.') {
            str = str.substring(0, str.length() - 1);
        }
        return  str;
    }

    private static String addCore(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        String a = reverse(num1);
        String b = reverse(num2);
        for (int i = 0; i < a.length(); i++) {
            int s = (a.charAt(i) -'0') + (b.charAt(i) - '0') + carry;
            carry = s / 10;
            char sum = (char)(s % 10 + 0);
            sb.append(sum);
        }
        if (carry == 1) {
            sb.append('1');
        }
        return reverse(sb.toString());
    }

    private static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i > 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

}
