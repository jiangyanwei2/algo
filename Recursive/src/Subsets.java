import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Subsets {
	public static List<List<Integer>> subsets(int[] nums) {
	    List<List<Integer>> result = new ArrayList<List<Integer>>();
	   
	    if(nums.length == 0){
	        return result;
	    }
	    
	    Arrays.sort(nums);
	    dfs(nums, 0, new ArrayList<Integer>(), result);
	    return result;
	}

	public static void dfs(int[] s, int index, List<Integer> path, List<List<Integer>> result){
		printList(path);
		result.add(new ArrayList<Integer>(path));
	    
	    for(int i = index; i < s.length; i++){
	        path.add(s[i]);
	        dfs(s, i+1, path, result);
	   //     path.remove(path.size()-1);
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
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.remove();
		printList(list);
		int[] nums = new int[] {1,2,3};
		subsets(nums);
	}
}
