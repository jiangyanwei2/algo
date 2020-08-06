package xunfei;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine().trim();
        String str = "爱讯飞789swr1wwen34ifly65tek";
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                list.add(str.charAt(i) - '0');
            }
        }
        if (list == null || list.size() == 0) {
            System.out.println(-1);
        } else {
            Collections.sort(list);
            for(Integer e : list) {
                sb.append(e);
            }
            System.out.println(sb.toString());
        }

    }
}
