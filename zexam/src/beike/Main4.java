package beike;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int i = 0;
            int j = arr.length - 1;
            for(; i < arr.length - 1; i++) {
                if (arr[i + 1] - arr[i] <= 0) {
                    break;
                }
            }
            for(; j > 0; j--) {
                if (arr[j - 1] - arr[j] <= 0) {
                    break;
                }
            }
            if (j == 1 || i == arr.length - 2) {
                System.out.println(1);
            } else {
                System.out.println(6);
            }
        }
    }
}
