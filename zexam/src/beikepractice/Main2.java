package beikepractice;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if (n % 2 == 0) {
            System.out.println(arr[(n - 1)/2]);
        } else {
            System.out.println(arr[n/2]);
        }
    }
}
