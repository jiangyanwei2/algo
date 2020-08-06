package quner;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       while (sc.hasNext()) {
           int n = sc.nextInt();
           long[] arr = new long[n + 1];
           long prev = 1;
           for (int i = 0; i < n + 1; i++) {
               for (int j = 0; j <= i ; j++) {
                   long cur = arr[j];
                   arr[j] = prev + cur;
                   prev = cur;
               }
           }
           printArray(arr);
       }
    }

    public static void printArray(long[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
                System.out.println();
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}
