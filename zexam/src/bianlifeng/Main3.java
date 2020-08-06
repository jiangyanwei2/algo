package bianlifeng;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int[] arr = stringToArray(line);
        int res;
        if (canReach(arr)) {
            res = ride(arr);
        }else {
            res = -1;
        }
        System.out.println(res);
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

    public static boolean canReach(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        int farest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (farest < i) return false;
            farest = Math.max(i + arr[i], farest);
        }
        return true;
    }

    public static int ride(int[] arr) {
        int steps = 0;
        int curFarthest = 0;
        int curEnd = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            curFarthest = Math.max(curFarthest, i + arr[i]);
            if (i == curEnd) {
                steps++;
                curEnd = curFarthest;
            }
        }
        return steps;
    }
}
