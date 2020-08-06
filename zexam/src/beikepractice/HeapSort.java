package beikepractice;
//heap parent (index - 1) / 2
//left child 2*index + 1
//right child 2*index + 2

public class HeapSort {

    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            heapInsert(arr, i);
        }
        swap(arr, 0, --n);
        while (n > 0) {
            heapify(arr, 0, n);
            swap(arr, 0, --n);
        }
    }

    public static void heapify (int[] arr, int index, int size) {
        int left = 2 * index + 1;
        while (left < size) {
            int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = 2 * index + 1;
        }

    }

    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
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
        heapSort(arr);
        printArray(arr);
    }

}
