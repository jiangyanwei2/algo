package pingduoduo;

import java.util.*;

public class Main6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxNum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        double res = 0;
        double[] tmp = new double[maxNum + 1];
        for (int i = 1; i <= maxNum; i++) {
            tmp[i] = calP(arr, i) - getSum(tmp, i);
            res += i * tmp[i];
        }
        System.out.println(String.format("%.2f",res));
    }

    public static double calP(int[] arr, int num) {
        double p = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= num) {
                  p *= (num * 1.0) / (arr[i] * 1.0);
            }
        }
        return p;
    }

    public static double getSum(double[] tmp, int num) {
        double sum = 0;
        for (int j = 0; j < num; j++) {
            sum += tmp[j];
        }
        return sum;
    }
}
