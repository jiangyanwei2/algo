package bilibili;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            int[] numbers = stringToArray(str);
            String res = printMinNumber(numbers);
            System.out.println(res);
        }
    }

    public static String printMinNumber(int [] numbers) {
        String s = "";
        if (numbers == null ||numbers.length == 0) {
            return s;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2) {
                String s1 = o1 + "" + o2;
                String s2 = o2 + "" + o1;
                return s1.compareTo(s2);
            }
        });
        for (Integer e : list) {
            s += e;
        }
        return s;
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
}
