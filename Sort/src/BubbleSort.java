//import java.util.Arrays;
public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		if(arr == null || arr.length < 2) {
			return;
		}
		for(int e = arr.length - 1; e > 0; e--) {
			for(int i = 0; i < e; i++) {
				if(arr[i] > arr[i+1]) {
					swap(arr,i,i+1);
				}
			}
		}
	}
	
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void printArray(int[] arr) {
		if(arr == null) {
			return;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {3,5,2,1,8,4};
		bubbleSort(arr);
		printArray(arr);
	}
}
