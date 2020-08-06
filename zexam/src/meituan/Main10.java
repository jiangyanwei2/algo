package meituan;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String money = sc.nextLine();
            String res = guiFanHua(money);
            System.out.println(res);
        }
    }

    public static String guiFanHua(String s) {
        boolean neg = false;
        String res = "";
        if (s.startsWith("-")) {
            neg = true;
            s = s.substring(1);
        }
        String[] arr = s.split("\\.");
        String zh = arr[0];
        String newzh = addQ(arr[0]);
        String xiao = "";
        if (arr.length == 1) {
            xiao = "00";
        }else {
            xiao = sheRu(arr[1]);
        }
        if (!neg) {
            res = "$" + newzh + "." + xiao;
        }else {
            res = "(" + "$" + newzh + "." + xiao + ")";
        }
        return res;
    }


    public static String addQ(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0 ; i--) {
            if ((s.length() - i) % 3 == 0 && i != 0) {
                sb.append(s.charAt(i));
                sb.append(",");
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.reverse().toString();
    }

    public static String sheRu(String s) {
        if (s.length() == 1) {
            s = s + "0";
            return s;
        } else if (s.length() > 2) {
            return s.substring(0,2);
        }else{
            return s;
        }
    }
}
