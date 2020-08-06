package s360;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sanbu2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] path = new int [M];
        int res = 0;
        for (int i = 0; i < M; i++) {
            path[i] = sc.nextInt();
        }
        Set<Integer> cur = new HashSet<>();
        for (int i = 1 ; i <= N ; i++) {
            cur.add(i);
        }
        for (int i = 0; i < M; i++) {
            Set<Integer> next = new HashSet<>();
            for (Integer j : cur) {
                if (j + path[i] <= N) next.add(j + path[i]);
                if (j - path[i] >= 1) next.add(j - path[i]);
            }
            cur = next;
        }
        System.out.println(cur.size());
    }
}
