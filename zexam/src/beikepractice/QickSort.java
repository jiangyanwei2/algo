package beikepractice;

import java.util.Scanner;
//1 2 3 5 4 2 8 2
public class QickSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        qickSort(arr, 0, n - 1);
        printArray(arr);
    }

    public static void qickSort(int[] arr, int begin, int end) {
        if (begin >= end) {
            return;
        }
        swap(arr, begin, begin + (int)((Math.random()* (end - begin + 1))));
        int j = partition(arr, begin, end);
        qickSort(arr, begin, j - 1);
        qickSort(arr, j + 1, end);
    }

    public static int partition(int[] arr, int begin, int end) {
        int pivot = arr[begin];
        int i = begin;
        int j = end;
        while(i < j) {
            while(i < j && arr[j] >= pivot) {
                j--;
            }
            while(i < j && arr[i] <= pivot) {
                i++;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, begin, j);
        return j;
    }


    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
                System.out.println();
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}
