package guanlianda;

import java.util.*;
//[23,24,25,21,12,22,31,23]
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String tmpLine = line.substring(1, line.length() - 1);
        int[] arr = stringToArray(tmpLine);
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int index = 1;
        while(index < n) {
            if (!stack.isEmpty() && arr[index] > arr[stack.peek()]) {
                int i = stack.pop();
                res[i] = index - i;
            } else {
                stack.push(index);
                index++;
            }
        }
        while (!stack.isEmpty()) {
            res[stack.pop()] = 0;
        }
        printArray(res);
    }

    public static int[] stringToArray(String s) {
        if (s == null || s.length() == 0) {
            return new int[]{};
        }
        String[] strArr = s.split(",");
        int[] res = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            res[i] = Integer.valueOf(strArr[i]);
        }
        return res;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
                System.out.print("]");
            } else {
                System.out.print(array[i] + ",");
            }
        }

    }
}
