public class NearestTarget {
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
        return  left - 1 >= 0 && Math.abs(target - arr[left - 1]) < Math.abs(target - arr[left]) ? left - 1 :left ;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5};
        System.out.println(binarySearch(arr, 3));
    }



}
