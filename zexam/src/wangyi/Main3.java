package wangyi;
import java.util.*;
//10
//53941 38641 31525 75864 29026 12199 83522 58200 64784 80987
//12199 29026 31525 38641 53941 58200 64784 75864 80987 83522
//4
//7 3 5 1
//7 3 5 1
public class Main3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    	int[] arr = new int[n]; 
    	for (int i = 0; i < n; i++) {
    		arr[i] = sc.nextInt();
    	}
    	quickSort(arr);
    	printArray(arr);
    }
	
	public static void quickSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		quickSort(arr, 0, arr.length - 1);
	}
 
	public static void quickSort(int[] arr, int l, int r) {
		if (l >= r) {
			return;
		}
			//swap(arr, l + (int) (Math.random() * (r - l + 1)), r);
			int j = partition(arr, l, r);
			quickSort(arr, l, j - 1);
			quickSort(arr, j + 1, r);
		
	}
 
	public static int partition(int[] arr, int l, int r) {
		int pivot = arr[l];
		int i = l;
		int j = r;
		while(i < j) {
			while(i < j && arr[i+1] <= pivot) {
				++i;
			}
			while(i < j && arr[j] >= pivot  ) {
				--j;
			}
			swap(arr, i, j);
		}
		swap(arr, l, j);
		return j;
		
	}
	
 
	public static void swap(int[] arr, int i, int j) {
		if (arr[i] + arr[j] % 2 == 1) {
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
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
