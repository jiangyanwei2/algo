package amazon;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] box = new int[n];
        int[] key = new int[m];
        for (int i = 0; i < n; i++) {
            box[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            key[i] = sc.nextInt();
        }
        int boxEven = countEven(box);
        int keyEven = countEven(key);
        //
    }

    public static int countEven(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                res++;
            }
        }
        return res;
    }
}
