package guanlianda;

import java.util.Scanner;

public class Main2 {
    public static int maxWater(int[] arr) {

        int left = 0;

        int right = arr.length - 1;

        int res = 0;

        int leftMax = 0, rightMax = 0;

        while (left < right) {

            if (arr[left] < arr[right]) {

                if (arr[left] >= leftMax) {

                    leftMax = arr[left];

                } else {

                    res += leftMax - arr[left];

                }
                left++;

            } else {

                if (arr[right] >= rightMax) {

                    rightMax = arr[right];

                } else {

                    res += rightMax - arr[right];

                }
                right--;

            }

        }

        return res;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};

//int n = sc.nextInt();

//int[] arr = new int[n];

//for (int i = 0; i < n; i++) {

//arr[i] = sc.nextInt();

        //}

        System.out.println(maxWater(arr));

        sc.close();

    }


}
