package meituan;

import java.util.ArrayList;
import java.util.Scanner;
//4
//1 2 1 2
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        int[] res = new int[n + 1];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            arr[i] = sc.nextInt();
        }
        int r = 1;
        for (int i = 1; i <= n ; i++) {
            list.add(i);
        }
        int index = 0;
        while(r <= n) {
            index = (arr[r] % list.size());
            res[index + 1] = n - r + 1;
            list.remove(index);
            r++;
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
