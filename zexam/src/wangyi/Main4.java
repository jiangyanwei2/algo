package wangyi;
import java.util.*;
//3 2  
//1 2 3    
//3  
//3
//1
//0
public class Main4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n]; 
    	for (int i = 0; i < n; i++) {
    		arr[i] = sc.nextInt();
    		
    	}
    	Arrays.sort(arr);
    	for (int i = 0; i < q; i++) {
    		int target = sc.nextInt();
    		int index = binarySearch(arr, target);
    	}
    }
	
	public static int binarySearch(int[] arr, int target){
	    int low = 0, high = arr.length - 1, mid;
	    while(low <= high){
	        mid = low + (high - low) / 2;
	        if(target <= arr[mid]){
	            high = mid - 1;
	        }else{
	            low = mid + 1;
	        }
	    }
	    if(low < arr.length && arr[low] == target)
	        return low;
	    else
	        return -1;
	}
}
