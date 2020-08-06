public class TargetLowerBound {
//1,3,3,5, 7 ,7,7,7,8,14,14
//
//    ^
    public static int binarySearchLowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        if (left < arr.length && arr[left] == target) {
            return left;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,3,3,5,7 ,7,7,7, 8,14,14};
        //int[] arr = {7};
        System.out.println(binarySearchLowerBound(arr, 4));
    }
}
