package kujiale;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> res = generateParenthesis(n);
        for (String s : res) {
            System.out.println(s);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n <= 0) {
            return res;
        }
        generate(res, "", n, 0, 0);
        return res;
    }

    public static void generate(List<String> res, String s, int n, int open, int close) {
        if (s.length() == 2 * n) {
            res.add(s);
            return;
        }
        if (open < n) {
            generate(res, s + "(", n, open + 1, close);
        }
        if (close < open) {
            generate(res, s + ")", n, open, close + 1);
        }
    }
}
