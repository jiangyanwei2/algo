package yuanjing;
import java.util.*;

public class Main1 {
	private static List<List<Integer>> res = new ArrayList<>();
    private static boolean[] used;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			List<List<Integer>> list = permute(arr);
			for (List<Integer> e : list) {
				for (int i = 0; i < e.size(); i++) {
					if (i != e.size() - 1) {
					System.out.print(e.get(i) +" ");
					}else {
						System.out.print(e.get(i));
					}
				}
				System.out.println();
			}
		}
	}
	
	
    public static List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<List<Integer>>();
        }
        used = new boolean[nums.length];
        LinkedList<Integer> p = new LinkedList<>();
        permute(p, 0, nums);
        return res;
    }
    
    private static void permute(LinkedList<Integer> p, int index, int[] nums) {
        if (index == nums.length) {
            res.add((LinkedList<Integer>)p.clone());
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                p.addLast(nums[i]);
                used[i] = true;
                permute(p, index + 1, nums);
                p.removeLast();
                used[i] = false;
            }
            
        }
    }
}
	
//	public void PermutationHelper(int[] arr, int i, List<Integer> list) {
//        if (i == arr.length - 1) {
//            String val = String.valueOf(arr);
//            if (!list.contains(val))
//                list.add(val);
//        } else {
//            for (int j = i; j < arr.length; j++) {
//                swap(arr, i, j);
//                PermutationHelper(arr, i+1, list);
//                swap(arr, i, j);
//            }
//        }
//    }
// 
//    public void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }


