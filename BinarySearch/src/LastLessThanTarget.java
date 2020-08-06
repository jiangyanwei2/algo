public class LastLessThanTarget {
    //1,3,3, 5 ,7,7,7,7,8,14,14
    //       ^
    public static int binarySearch (int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right < 0 ? -1 : right;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,3, 5 ,7,7,7,7,8,14,14};
        System.out.println(binarySearch(arr, 7));
    }
}
