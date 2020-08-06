package beike;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            long min = Long.MAX_VALUE;
            long diff;
            int index = 0;
            for (int i = 0; i < n - 1; i++) {
                diff = Math.abs(arr[i + 1] - arr[i]);
                if (diff < min) {
                    min = diff;
                    index = i;
                }
            }
            System.out.print(arr[index] + " " + arr[index + 1]);
            System.out.println();
        }

    }
}
