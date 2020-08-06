package bianlifeng;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int[] arr = stringToArray(line);
        int res = maxSum(arr);
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

    public static int maxSum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int curSum = array[0];
        int maxSum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (curSum < 0) {
                curSum = array[i];
            }else {
                curSum += array[i];
            }
            if (curSum > maxSum) {
                maxSum = curSum;
            }
        }
        return maxSum;
    }
}
