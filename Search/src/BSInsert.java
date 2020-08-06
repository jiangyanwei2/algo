
public class BSInsert {
	public int searchInsert(int[] nums, int target) {
        int index = 0;
        if (nums == null || nums.length == 0) {
            return index;
        }
        int low = 0;
        int high = nums.length - 1;
        int mid = (low + high) / 2;
        if (nums.length == 1){
            return target > nums[0] ? 1 : 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length ;
        }
        if (target < nums[0]) {
            return 0;
        }
        while (low <= high) {
            
            if (target > nums[mid]) {
                low = mid + 1;
            }
            else if (target < nums[mid]) {
                high = mid - 1;
            }else{
                return mid;
            }
            mid = (low + high) / 2;
        }
        return   high + 1;
        
    }
	
	public static void main(String[] args) {
		BSInsert bsi = new BSInsert();
		int[] nums = {2,4};
		int index = bsi.searchInsert(nums, 3);
		System.out.println(index);
	}

}
