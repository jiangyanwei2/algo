package beikepractice;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        String nums = str.substring(1, str.length() - 1);
        int[] arr = stringToArray(nums);
        System.out.println(FindGreatestSumOfSubArray(arr));

    }

    public static int[] stringToArray(String s) {
        if (s == null || s.length() == 0) {
            return new int[]{};
        }
        String[] strArr = s.split(",");
        int[] res = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            res[i] = Integer.valueOf(strArr[i].trim());
        }
        return res;
    }

    public static int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0){
            return 0;
        }
        int curSum = array[0];
        int maxSum = array[0];
        for (int i = 1; i < array.length; i++){
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
