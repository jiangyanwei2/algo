package wangyi;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main1 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        HashMap<Integer, Integer> map = new HashMap<>();
	        int[] sa = new int[n]; 
	        for (int i = 0; i < n; i++) {
	        	int score = sc.nextInt();
	        	map.put(i, score);
	        	sa[i] = score;
	        }
	        Arrays.sort(sa);
	        int q = sc.nextInt();
	        for (int i = 0; i < q; i++) {
	        	int stuNumber = sc.nextInt() - 1;
	        	int score = map.get(stuNumber);
	        	int count = binarySearch(sa, score);
	        	double tmp = count * 1.0 / n * 100;
//	        	BigDecimal bg = new BigDecimal(tmp);
//	        	double res = bg.setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();
	        	System.out.println(String.format("%.6f", tmp));
	        	
	        }
	    }
	 
	 public static int binarySearch(int[] sa, int score){
		    int low = 0, high = sa.length - 1, mid;
		    while(low <= high){
		        mid = low + (high - low) / 2;
		        if(score >= sa[mid]){
		            low = mid + 1;
		        }else{
		            high = mid - 1;
		        }
		    }
		    if(high >= 0 && sa[high] == score)
		        return high;
		    else
		        return -1;
		}
	 
}
