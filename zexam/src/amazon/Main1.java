package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//hdeRaRahde
//IADAKHR
public class Main1 {
    List<String> res = new ArrayList<>();
   public  List<String>  busietRouteList(String firstRoute, String secondRoute, int pickupPoints) {
        String firstRouteLower = firstRoute.trim().toLowerCase();
        String secondRouteLower = secondRoute.trim().toLowerCase();
        StringBuilder common = new StringBuilder();

        boolean[] bitmap = new boolean[26];
        for (int i = 0; i < firstRouteLower.length(); i++) {
            bitmap[firstRouteLower.charAt(i) - 'a'] = true;
        }

       for (int i = 0; i < 26; i++) {
           for (int j = 0; j < secondRouteLower.length(); j++) {
               if (bitmap[i] && secondRouteLower.charAt(j) - 'a' == i) {
                   common.append((char)('a' + i));
                   break;
               }
           }
       }

        String commonStr = common.toString();
        comb(new StringBuilder(), commonStr, 0, commonStr.length() - 1, pickupPoints);

       return res;



    }

    private void comb(StringBuilder sb, String common, int start, int n, int k) {
        if (k == 0) {
            res.add(sb.toString());
            return;
        }
        // for (int i = start; i <=n; i++) {
        for (int i = start; i <= n - k + 1; i++) {
            sb.append(common.charAt(i));
            comb(sb, common,i + 1, n, k - 1);
           sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
       Main1 m = new Main1();
        String firstRoute = "hdeRaRahde";
        String secondRoute = "IADAKHR";
        int pickupPoints = 3;
        printList(m.busietRouteList(firstRoute,secondRoute,pickupPoints));
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

}
