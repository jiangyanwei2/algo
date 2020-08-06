package youzan;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        String[] strArr = input.split("\\|");
        int[] num1 = stringToArray(strArr[0]);
        int[] num2 = stringToArray(strArr[1]);
        ArrayList<Integer> list = merge(num1, num2);
        printList(list);

    }

    public static ArrayList<Integer> merge (int[] a, int[] b) {
        int lena = a.length;
        int lenb = b.length;
        int pa = 0, pb = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while((pa < lena) && (pb < lenb))
        {
            if (a[pa] < b[pb]) {
                list.add(a[pa++]);
            }
            else if (b[pb] < a[pa]) {
                list.add(b[pb++]);
            } else {
                list.add(a[pa++]);
                pb++;
            }
        }
        while(pa < lena) {
            list.add(a[pa++]);
        }
        while(pb < lenb) {
            list.add(b[pb++]);
        }
        return list;

    }

    public static int[] stringToArray(String s) {
        if (s == null || s.length() == 0) {
            return new int[]{};
        }
        String[] s_arr = s.split(",");
        int[] res = new int[s_arr.length];
        for (int i = 0; i < s_arr.length; i++) {
            res[i] = Integer.valueOf(s_arr[i]);
        }
        return res;
    }

    public static void printList(List<Integer> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
                System.out.print("]");
                System.out.println();
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
    }

}
