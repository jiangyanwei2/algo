import java.util.*;
public class Median {
	
	    private int count = 0;
	    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>(){
	      @Override
	        public int compare(Integer o1, Integer o2){
	            return o2 - o1;
	        }
	    });
	    public void Insert(Integer num) {
	        count++;
	        if((count & 1) == 1){
	            minHeap.offer(num);
	            maxHeap.offer(minHeap.poll());
	        }
	        else{
	            maxHeap.offer(num);
	            minHeap.offer(maxHeap.poll());
	        }
	    }

	    public Double GetMedian() {
	        if (count == 0)
	            return null;
	        if((count & 1) == 1)
	            return new Double(maxHeap.peek());
	        else
	            return new Double((maxHeap.peek() + minHeap.peek())*0.5);
	        
	    }
	    
	    public ArrayList<Integer> maxInWindows(int [] num, int size)
	    {
	        if(num == null || num.length <= 0 || size <= 0)
	            return null;
	        ArrayList<Integer> res = new ArrayList<>();
	         
	        for(int i = 0;i<=num.length - size;i++){
	        	int max = num[i];
	            for(int j = i;j < i + size; j++){
	                if(num[j] >= max)
	                    max =num[j];
	            }
	            res.add(max);
	            
	        }
	        return res;
	    }
	    
	    public static void main(String[] args) {
	    	Median m = new Median();
	    	m.Insert(5);
 	    	Double m1 = m.GetMedian();
 	    	System.out.println(m1);
	    	m.Insert(3);
	    	Double m2 = m.GetMedian();
	    	System.out.println(m2);
	    	int[] num = {2,3,4,2,6,2,5,1};
	    	ArrayList<Integer> res = m.maxInWindows(num, 3);
	    	System.out.println(res);  	
	    }


	}


