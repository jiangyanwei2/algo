package meituan;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(res[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    int op = arr[i] & arr[j];
                    if(op == 0) {
                        res[i] = 1;
                        res[j] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (res[i] == 0) {
                res[i] = -1;
            }
        }
        printArray(res);
    }

    public static void printArray(int[] array) {
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
