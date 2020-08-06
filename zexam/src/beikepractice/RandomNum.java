package beikepractice;

import java.util.Arrays;

public class RandomNum {
    public static void main(String[] args) {
        int[] arr = new int[101];
        Arrays.fill(arr ,2);

        for (int i = 1; i <= 100 ; i++) {
            int num = (int)(Math.random() * 100 + 1 );
            if (arr[num] == 0) {
                while (arr[num] == 0) {
                    num = (int)(Math.random() * 100 + 1 );
                }

            }
            System.out.println("Day " + i + ":Pill#" + num);
            --arr[num];

        }

    }

}
