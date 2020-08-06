package tencent;

import java.util.LinkedList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String[] arr = new String[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextLine();
            }
            operation(arr);
        }
    }

    public static void operation(String[] arr) {
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            String[] strArr = arr[i].split(" ");
            if (strArr.length == 2) {
                int num = Integer.parseInt(strArr[1]);
                queue.offer(num);
            } else {
                if (arr[i].equals("TOP")) {
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    }else{
                        System.out.println(queue.peek());
                    }
                }
                if (arr[i].equals("POP")) {
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    }else{
                        queue.poll();
                    }
                }
                if (arr[i].equals("SIZE")) {
                    System.out.println(queue.size());
                }
                if (arr[i].equals("CLEAR")) {
                    queue.clear();
                }
            }
        }
    }
}
