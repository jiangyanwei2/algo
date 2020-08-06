package shopee;

import java.util.*;

public class Main3 {

    public static int pos = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();

        if (isVailad(str)) {
            str = str + "#";
            double tmp = expr(str.toCharArray());
            int res = (int)Math.floor(tmp);
            System.out.println(res);
        } else {
            System.out.println("ERROR");
        }

    }


    public static double expr(char[] s) {
        double t = term(s);
        while (s[pos] == '+' || s[pos] == '-') {
            if (s[pos] == '+'){
                pos++;
                t = t + term(s);
            }
            else if (s[pos] == '-'){
                pos++;
                t = t - term(s);
            }
        }
        return t;
    }

    public static double term(char[] s) {
        double t = factor(s);
        while (s[pos] == '*' || s[pos] == '/') {
            if (s[pos] == '*'){
                pos++;
                t = t * factor(s);
            }
            else if (s[pos] == '/'){
                pos++;
                t = t / factor(s);
            }
        }
        return t;
    }

    public static double factor(char[] s) {
        if (s[pos] == '('){
            pos++;
            double t = expr(s);
            if (s[pos] == ')'){
                pos++;
            }
            return t;
        }else{
            int t = 0;
            while('0' <= s[pos] && s[pos] <= '9'){
                t = t * 10 + s[pos] - '0';
                pos++;
            }
            return (double)t;
        }
    }

    public static boolean isVailad(String str) {
        //String regex ="^[0-9\\.\\(\\)\\+\\-\\*\\/]+$";
        //return str.matches(regex);
        while(str.matches(".*\\([0-9]+([\\+\\-\\*\\/][0-9]+)+\\).*")){
            str.replaceAll("\\([0-9]+([\\+\\-\\*\\/][0-9]+)+\\)","0");
        }
        return str.matches("^[0-9]+([\\+\\-\\*\\/][0-9]+)+$");

    }

}
