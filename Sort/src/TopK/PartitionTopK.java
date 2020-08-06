package TopK;

public class PartitionTopK {

    public static int findTopK(int[] arr, int left, int right, int k) {
        int index = -1;
        if (left < right) {
            int pos = partition(arr,left, right);
            int len = pos - left + 1;
            if (len == k) {
                index = pos;
            } else if (len > k) {
                index = findTopK(arr, left, pos - 1, k);
            } else {
                index = findTopK(arr, pos + 1, right, k - len);
            }
        }
        return index;
    }

    public static int partition(int[] arr, int l, int r) {
        int i = l;
        int j = r;
        int pivot = arr[l];
        while (i < j) {
            while (i < j && arr[j] >= pivot) {
                j--;
            }
            while (i < j && arr[i] <= pivot) {
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

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0};
        int index = findTopK(arr, 0, arr.length - 1, 2);
        System.out.println(index);
        System.out.println(arr[index]);
    }
}
