package pingduoduo;

import java.util.*;

public class Main9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long count = n * m;
        long[] arr = new long[n * m];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                  arr[index++] = i * j;
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length - k]);

    }
}
