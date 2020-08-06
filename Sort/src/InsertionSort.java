
public class InsertionSort {
	public static void insertionSort(int[] arr) {
		if(arr == null || arr.length < 2) {
			return;
		}
		for(int i = 1; i < arr.length; i++) {
			for(int j = i; j > 0 && arr[j] < arr[j -1]; j--) {
				swap(arr,j,j-1);
			}
		}
	}
	
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void printArray(int[] arr) {
		if(arr == null)
			return;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,4,2,8};
		insertionSort(arr);
		printArray(arr);
	}
}
