package pingduoduo;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(";");
        int[] arr = stringToArray(strArr[0]);
        int N = Integer.valueOf(strArr[1]);
        Arrays.sort(arr);
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        res.addAll(even);
        res.addAll(odd);
        printList(res, N);

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

    public static void printList(List<Integer> list, int N) {
        for (int i = 0; i < N; i++) {
            if (i == N - 1) {
                System.out.print(list.get(i));
                System.out.println();
            } else {
                System.out.print(list.get(i) + ",");
            }
        }
    }


}
