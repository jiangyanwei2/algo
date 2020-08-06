package beikepractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pingDuoDuoPukepai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String mei = sc.nextLine().trim();
            String bai = sc.nextLine().trim();
            List<String> res = new ArrayList<>();
            dfs(mei, bai, "", 0, res, "");
            System.out.println("{");
            for(String methods : res) {
                for (int j = 0; j < methods.length(); j++) {
                    if (j == methods.length() - 1) {
                        System.out.print(methods.charAt(j));
                        System.out.println();
                    } else {
                        System.out.print(methods.charAt(j) + " ");
                    }
                }
            }
            System.out.println("}");
        }
    }

    public static void dfs(String mei, String bai, String newStr, int i, List<String> res, String way) {
        if (bai.equals(newStr)) {
            res.add(way);
        }
        if (i == mei.length()) {
            return;
        }
        way += "d";
        dfs(mei, bai, newStr, i + 1, res, way);
        way = way.substring(0, way.length() - 1);

        String tmp1 = newStr;
        newStr = mei.substring(i, i + 1) + newStr;
        way += "l";
        dfs(mei, bai, newStr, i + 1, res, way);
        way = way.substring(0, way.length() - 1);
        newStr = tmp1;

        String tmp2 = newStr;
        newStr = newStr + mei.substring(i, i + 1);
        way += "r";
        dfs(mei, bai, newStr, i + 1, res, way);
        way = way.substring(0, way.length() - 1);
        newStr = tmp2;



    }
}
