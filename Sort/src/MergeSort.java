
public class MergeSort {
	
	public static void mergeSort(int[] arr) {
		if(arr == null || arr.length < 2) {
			return;
		}
	    mergeSort(arr, 0, arr.length-1);	
	}
	
	public static void mergeSort(int[] arr,int L,int R) {
		if(L == R) {
			return;
		}
		int mid = L + (R - L)/2;
		mergeSort(arr, L, mid);
		mergeSort(arr, mid+1, R);
		merge(arr, L, mid, R);
	}
	
	public static void merge(int[] arr, int L, int mid, int R) {
		int[] tmp = new int[R-L+1];
		int i = 0;
		int pl = L;
		int pr = mid+1;
		while((pl <= mid) && (pr <= R))
		{
			tmp[i++] = arr[pl] < arr[pr] ? arr[pl++] : arr[pr++]; 
		}
		while(pl <= mid) {
			tmp[i++] = arr[pl++];
		}
		while(pr <= R) {
			tmp[i++] = arr[pr++];
		}
		for(int j = 0; j< tmp.length; j++) {
			arr[L+j]= tmp[j];
		}	
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
	public static void mergeSort1(int[] arr) {
		if(arr == null || arr.length < 2) {
			return;
		}
		int interval = 1;
		while (interval < arr.length) {
			for (int i = 0;  i + interval < arr.length; i += 2 * interval) {
				int left = i;
				int mid = i + interval - 1;
				int right = i + 2 * interval - 1;
				if (right > arr.length - 1) {
					right = arr.length - 1;
				}
				merge(arr, left, mid, right);
			}
			interval *= 2;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,4,2,8,6};
		//mergeSort(arr);
		mergeSort1(arr);
		printArray(arr);
	} 
	
}
