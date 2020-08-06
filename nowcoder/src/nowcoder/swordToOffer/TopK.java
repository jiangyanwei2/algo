package nowcoder.swordToOffer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;


public class TopK {
	public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> res = new ArrayList<>();
		if (input == null || input.length < k || k < 1) {
			return res;
		}
	   PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
		   public int compare(Integer o1, Integer o2) {
			   return o2.compareTo(o1);
		   }
	   });
	   for (int i = 0; i < input.length; i++) {
		   if (i < k) {
			   maxHeap.offer(input[i]);
		   }
		   if (input[i] < maxHeap.peek()) {
			   maxHeap.poll();
			   maxHeap.offer(input[i]);
		   }
	   }
	   for (Integer e : maxHeap) {
		   res.add(e);
	   }
		      return res;
	    }
	public static void main(String[] args) {
		int[] input = {10,9,8,3,2,1,4,5,6,6};
		int k = 3;
		System.out.println(GetLeastNumbers_Solution(input, k));
		
	}
}
