package beike;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j && Math.min(arr[i], arr[j]) > 0.9 * Math.max(arr[i], arr[j])){
                        count++;
                    }
                }
            }
            System.out.println(count/2);
        }
    }
}
