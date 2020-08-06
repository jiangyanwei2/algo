
public class QuickSort {
	public static void quickSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		quickSort(arr, 0, arr.length - 1);
	}

	public static void quickSort(int[] arr, int l, int r) {
		if (l >= r) return;
		swap(arr, l + (int)(Math.random() * (r - l + 1)), r);
		int j = partition(arr, l, r);
		quickSort(arr, l, j - 1);
		quickSort(arr, j + 1, r);
		
	}

	public static int partition(int[] arr, int l, int r) {
         int i = l;
         int j = r;
         int pivot = arr[l];
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
        swap(arr, l, j);
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

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,4,2,8,2};
		quickSort(arr);
		printArray(arr);
	}

}
