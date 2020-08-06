package qianxin;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int[] arr = stringToArray(line);
        int sumS1 = arr[0] + arr[1] + arr[2] + arr[3];
        int sumS2 = arr[3] + arr[4] + arr[5] + arr[6];
        int sumS3 = arr[6] + arr[7] + arr[8] + arr[0];
        boolean eq = (sumS1 == sumS2) && (sumS2 == sumS3);
        if (eq) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }

    public static int[] stringToArray(String s) {
        if (s == null || s.length() == 0) {
            return new int[]{};
        }
        String[] strArr = s.split(",");
        int[] res = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            res[i] = Integer.valueOf(strArr[i]);
        }
        return res;
    }
}
