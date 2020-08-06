package kazhongxin;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] map = new int[n + 1][n + 1];
        sc.nextLine();
        while (sc.hasNext()) {
            String str = sc.nextLine().trim();
            String[] strArr = str.split(" ");
            map[Integer.valueOf(strArr[0])][Integer.valueOf(strArr[1])] = Integer.valueOf(strArr[2]);
        }

        int[] dp = new int[n + 1];
        dp[n] = 0;
        Arrays.fill(dp, Integer.MIN_VALUE);
        for (int i = n - 1; i >= 1 ; i--) {
            for (int j = i + 1; j <= n; j++) {
                dp[i] = Math.max(dp[i], map[i][j]);
            }
        }
        printArray(dp);

    }

    public static void printArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
                System.out.println();
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}
