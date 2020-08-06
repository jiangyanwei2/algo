package xunfei;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String tmp = str.substring(1, str.length() - 1);
        int[] arr = stringToArray(tmp);
        int res = binarySearch(arr, 19, 0, arr.length - 1);
        if (res == - 1) {
            System.out.println(-1);
        } else {
            System.out.println(res + 1);
        }

    }
    public static int[] stringToArray(String s) {
        String[] s_arr = s.split(",");
        int[] res = new int[s_arr.length];
        for (int i = 0; i < s_arr.length; i++) {
            res[i] = Integer.valueOf(s_arr[i]);
        }
        return res;
    }

    public static int binarySearch(int[] arr, int key, int low, int high) {

        if (arr == null || arr.length == 0 || key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }
        int middle = low + (high - low) / 2;
        if (arr[middle] > key) {
            //比关键字大则关键字在左区域
            return binarySearch(arr, key, low, middle - 1);
        } else if (arr[middle] < key) {
            //比关键字小则关键字在右区域
            return binarySearch(arr, key, middle + 1, high);
        } else {
            return middle;
        }
    }
}
