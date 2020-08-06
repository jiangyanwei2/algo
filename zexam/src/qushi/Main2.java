package qushi;

import java.util.*;

public class Main2 {
    private static String process(String num1, String num2)
    {   int[] money = {1,5,10,20,50,100};
        String[] Scounts = num1.split(" ");
        int[] counts = new int[Scounts.length];
        for (int i = 0; i < Scounts.length; i++) {
            counts[i] = Integer.valueOf(Scounts[i]);
        }
        int n = Integer.valueOf(num2);
        int[] dp = new int[n + 1];
        dp[0] = 0;
        int[] cur = new int[n + 1];
        cur[0] = 1;
        for (int i = 0; i < 6; i++) {
            int c = counts[i];
            for (int j = n; j >= money[i]; j--) {
                for (int k = 1; k <= c && k * money[i] <= j; k++) {
                    dp[j] = dp[j - k * money[i]] + k * cur[j - k * money[i]] ;
                    cur[j] = cur[j - k * money[i]];
                }
            }
        }
        Integer res = dp[n];
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strValueSequences = sc.nextLine();
        String strChargeNum = sc.nextLine();

        String sum = process(strValueSequences, strChargeNum);
        System.out.println(sum);
    }
}
