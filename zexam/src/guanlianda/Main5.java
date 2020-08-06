package guanlianda;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> res = generate(n);
        System.out.println("[");
        for (int i = 0; i < res.size() ; i++) {
            if (i == res.size() - 1) {
                System.out.println("\"" +res.get(i) + "\"");
            } else {
                System.out.println("\"" +res.get(i) + "\"" + ",");
            }
        }
        System.out.println("]");
    }

    public static List<String> generate(int n) {
        List<String> res = new ArrayList<>();
        if (n < 0) {
            return res;
        }
        gen(res,  "", 0, 0, n);
        return res;
    }

    private static void gen(List<String> res, String s, int open, int close, int n) {
        if (s.length() == 2 * n) {
            res.add(s);
            return;
        }
        if (open < n) {
            gen(res, s + "{", open + 1, close, n);
        }
        if (close < open) {
            gen(res, s + "}", open, close + 1, n);
        }
    }
}
