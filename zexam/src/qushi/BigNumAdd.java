package qushi;

import java.util.Scanner;

public class BigNumAdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.nextLine();
        String num2 = sc.nextLine();


        //String num1 = "199.999";
       // String num2 = "0.001";
        String sum = add(num1, num2);
        System.out.println(sum);
//        System.out.println("2234567890223456789022345678902234567890.223456789022345678902234567890223456789");
    }

    private static String[] split(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                return new String[]{str.substring(0, i), str.substring(i + 1)};
            }
        }
        return new String[]{str, ""};
    }

    private static String add(String num1, String num2) {
        // 坑1 ：如何拿到正确的数
        String[] number1 = split(num1);
        String[] number2 = split(num2);
        String Integer1 = number1[0];
        String Integer2 = number2[0];
        String dot1 = number1[1];
        String dot2 = number2[1];
        int jw = 0;

        StringBuilder dotsb1 = new StringBuilder(dot1);
        StringBuilder dotsb2 = new StringBuilder(dot2);
        // 坑2：小数点尾数对不齐低的尾要补齐
        while (dotsb1.length() != dotsb2.length()) {
            if (dotsb1.length() < dotsb2.length()) {
                dotsb1.append('0');
            } else {
                dotsb2.append('0');
            }
        }
        dotsb1.reverse();
        dotsb2.reverse();

        StringBuilder integerRes = new StringBuilder();
        int len2 = dotsb1.length();
        boolean flag = true;
        for (int i = 0; i < len2; i++) {
            int tmp = jw;
            if (i < dotsb1.length()) {
                tmp = dotsb1.charAt(i) - '0' + tmp;
            }
            if (i < dotsb2.length()) {
                tmp = dotsb2.charAt(i) - '0' + tmp;
            }
            if (tmp >= 10) {
                jw = tmp / 10;
                tmp %= 10;
            } else {
                jw = 0;
            }
            char c = (char) (tmp + '0');
            // 坑3：刚开始加可能都是 0
            if (flag && c == '0') {
                continue;
            } else if (c != '0') {
                flag = false;
            }

            integerRes.append(c);
        }
        // 坑4：小数位可能全是 0
        if (!flag) {
            integerRes.append(".");
        }
        StringBuilder sb1 = new StringBuilder(Integer1);
        sb1.reverse();
        StringBuilder sb2 = new StringBuilder(Integer2);
        sb2.reverse();
        int len1 = sb1.length() > sb2.length() ? sb1.length() : sb2.length();
        for (int i = 0; i < len1; i++) {
            int tmp = jw;
            if (i < sb1.length()) {
                tmp = sb1.charAt(i) - '0' + tmp;
            }
            if (i < sb2.length()) {
                tmp = sb2.charAt(i) - '0' + tmp;
            }
            if (tmp >= 10) {
                jw = tmp / 10;
                tmp %= 10;
            } else {
                jw = 0;
            }
            integerRes.append((char) (tmp + '0'));
        }
        // 坑5：最后一个进位
        if (jw == 1) {
            integerRes.append('1');
        }
        // 最后倒回去
        return integerRes.reverse().toString();
    }
}
