package Zoom;

import java.util.Arrays;

public class BubbleSort {
    public void bubbleSort (int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        for (int i = nums.length - 1; i > 0 ; i--) {
            for (int e = 0; e < i; e++) {
                if (nums[e] > nums[e + 1]) {
                    swap(nums, e, e + 1);
                }
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int e = nums[i];
        nums[i] = nums[j];
        nums[j] = e;
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

    public static void main(String[] args) {
        int[] arr1 = new int[0];
        int[] arr2 = {-3, -2, 1, 0};
         BubbleSort bubbleSort = new BubbleSort();
         bubbleSort.bubbleSort(arr2);
         BubbleSort.printArray(arr2);


    }

    public boolean test(int [] nums) {
        int[] nums1 = new int[nums.length];
        boolean res = false;
        // copy array

        bubbleSort(nums);
        Arrays.sort(nums1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums1[i]) {
                break;
            }
            res = true;
        }
        return res;
    }

}
