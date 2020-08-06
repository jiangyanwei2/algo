package beike;

import java.util.*;

public class Main33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long count = 0;
            int max = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] < 0.9 * arr[i + 1]) {
                    list.add(i);
                    continue;
                }
            }
            if (list == null || list.size() == 0) {
                count = arr.length * (arr.length - 1);
                System.out.println(count/2);
            }
            else if (list.size() == 1) {
                max = Math.max(list.get(0) + 1, arr.length - list.get(0) - 1);
                count = max * (max - 1);
                System.out.println(count/2);
            }else {
                for (int i = 0; i < list.size() - 1; i++) {
                    max = Math.max(max, list.get(i + 1) - list.get(i));
                }
                count = max * (max - 1);
                System.out.println(count/2);
            }


        }
    }
}
