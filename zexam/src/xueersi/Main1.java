package xueersi;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.nextLine();
            String noSpace = input.replaceAll(" ", "");
            String res = str2Int(noSpace);
            System.out.println(res);
        }
    }

    public static String str2Int(String str) {
        String res = "0-0";
        if (str == null || str.length() == 0) {
            return "0-0";
        }
        String regex = "^-?\\d+.*";
        if (str.matches(regex)) {
            int i = 0;
            if(str.startsWith("-")) {
                i = 1;
            }
            for (; i < str.length(); i++) {
                if (!Character.isDigit(str.charAt(i))) {
                    break;
                }
            }
            String num = str.substring(0, i);
            //Long d= Long.valueOf(num);
            res = "1-" + num;
            return res;
        } else {
            return res;
        }
    }
}
