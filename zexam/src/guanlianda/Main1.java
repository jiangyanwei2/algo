package guanlianda;

import java.util.*;

public class Main1 {


    public static int[] switchCard(int[] a, int[] b) {

        int[] res = {-1, -1};

        if (a == null || a.length == 0 || b == null || b.length == 0) {

            return res;

        }

        int sumA = getSum(a);

        int sumB = getSum(b);

        int diff = sumA - sumB;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                if (a[i] - b[j] == diff / 2) {

                    return new int[]{i, j};

                }

            }

        }
        return res;

    }

    public static int getSum(int[] arr) {

        int res = 0;

        for (int i = 0; i < arr.length; i++) {

            res += arr[i];

        }

        return res;

    }

    public static void main(String[] args) {

        int[] a = {1, 2, 5};

        int[] b = {2, 4};

        int[] res = switchCard(a, b);

        System.out.println(a[res[0]]+ " " + b[res[1]]);

    }


}

