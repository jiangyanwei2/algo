package shunfeng;


import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] LIS = new int[n];
            int[] minV = new int [n + 1];
            for (int i = 0; i < n ; i++) {
                LIS[i] = 1;
                minV[i] = Integer.MAX_VALUE;
            }
            minV[n] = Integer.MAX_VALUE;
            minV[1] = arr[0];
            int res = 1;
            int end = 1;
            for (int i = 1; i < n; i++) {
                int index = lowerBound(minV, 1, end, arr[i]);
                if (index != -1) {
                    LIS[i] = index + 1;
                    if (LIS[i] > res) {
                        res = LIS[i];
                        end = res;
                    }
                }
                if (arr[i] < minV[LIS[i]]) {
                    minV[LIS[i]] = arr[i];
                }
            }
            System.out.println(res);

    }

    public static int lowerBound (int[] arr, int begin, int end, int target) {
        int left = begin;
        int right = end;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        if (left < arr.length && arr[left] == target) {
            return left;
        } else {
            return -1;
        }
    }
}
