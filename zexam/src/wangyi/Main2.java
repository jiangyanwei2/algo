package wangyi;

import java.util.*;

public class Main2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        while (times > 0) {
        	int n = sc.nextInt();
        	int[] arr = new int[n]; 
        	for (int i = 0; i < n; i++) {
        		arr[i] = sc.nextInt();
        	}
        	Arrays.sort(arr);
        	
        }
    }
}
