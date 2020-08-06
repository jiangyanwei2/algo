package guanlianda;

import java.util.Scanner;
//7
//[0,1,0,1,1,0,0,1]
//1000000000
//
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String tmp = sc.nextLine();
        String line = sc.nextLine();
        String tmpLine = line.substring(1, line.length() - 1);
        int[] arr = stringToArray(tmpLine);
        int n = arr.length;

        while(N > 0) {
            int[] res = new int[n];
            for (int i = 1; i < n - 1; i++) {
                if (arr[i - 1] == arr[i + 1]) {
                    res[i] = 1;
                }
            }
            arr = res;
            N--;
        }
        printArray(arr);
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

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
                System.out.print("]");
            } else {
                System.out.print(array[i] + ",");
            }
        }

    }
}
