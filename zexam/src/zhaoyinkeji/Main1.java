package zhaoyinkeji;

import java.util.*;

public class Main1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        dfs("", 0, n, list);
        int all = (int)Math.pow(3, n);
        int bad = 0;
        int res = 0;
        for (String str : list) {
            if (notBonus(str)) {
                bad++;
            }
        }
        res= all - bad;
        System.out.println(res);
        //System.out.println(notBonus("CC"));
    }



    public static int count(int n) {
        int all = (int)Math.pow(3, n);
        return all;

    }

    public static void dfs(String str, int i, int n, List<String> list) {
        if (i == n) {
            list.add(str);
            return;
        }

        str += "A";
        dfs(str, i + 1, n, list);
        str = str.substring(0, str.length() - 1);
        str += "B";
        dfs(str, i + 1, n, list);
        str = str.substring(0, str.length() - 1);
        str += "C";
        dfs(str, i + 1, n, list);
        str = str.substring(0, str.length() - 1);

    }

    public static void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
                System.out.println();
            } else {
                System.out.print(list.get(i) + " ");
            }
        }
    }

    public static boolean notBonus(String str) {
        String pattern1 = "(.*C.*){2,}";
        String pattern2 = ".*B{3,}.*";
        return  str.matches(pattern1) || str.matches(pattern2);
    }
}
