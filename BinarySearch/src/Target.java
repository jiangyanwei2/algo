public class Target {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            }else if (arr[mid] > target) {
                right = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static int binarySearch1(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid;
            }else if (arr[mid] > target) {
                right = mid;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,3,5,7,8,14};
        System.out.println(binarySearch(arr, 6));
        System.out.println(binarySearch1(arr, 6));
        
    }
}
