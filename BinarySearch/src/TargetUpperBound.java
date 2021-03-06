public class TargetUpperBound {
    //1,3,3,5,7,7,7, 7 ,8,14,14
    //               ^
    public static int binarySearch (int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (right >= 0 && arr[right] == target) {
            return right;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        //int[] arr = {1,3,3,5,7,7,7, 7 ,8,14,14};
        int[] arr = {7};
        System.out.println(binarySearch(arr, 7));
    }
}
