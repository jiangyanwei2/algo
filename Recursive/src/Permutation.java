import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Permutation {
    private List<List<Integer>> res = new ArrayList<>();
    boolean[] used;
    public  List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<List<Integer>>();
        }
        used = new boolean[nums.length];
        LinkedList<Integer> p = new LinkedList<>();
        permute(p, 0, nums);
        return res;
    }
    
    private void permute(LinkedList<Integer> p, int index, int[] nums) {
        if (index == nums.length) {
            res.add((LinkedList<Integer>)p.clone());
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                p.addLast(nums[i]);
                printList(p);
                used[i] = true;
                permute(p, index + 1, nums);
                p.removeLast();
                printList(p);
                used[i] = false;
            }
            
        }
    }
    public static void printList(List list) {
    	Iterator it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.print(obj + " ");
		}
		System.out.println("");
    }
    
    public static void main(String[] args) {
    	int[] nums = new int[] {1,2,3};
    	Permutation p = new Permutation();
		p.permute(nums);
	}
}
