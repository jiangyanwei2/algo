package guanlianda;

import java.util.Scanner;
//[1,2,3,4,5]
//[1,2,3,4]
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String tmpLine = line.substring(1, line.length() - 1);
        int[] arr = stringToArray(tmpLine);
        System.out.println(arr[arr.length/2]);
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
