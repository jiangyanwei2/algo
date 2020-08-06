package yuanjing;

import java.util.*;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			int t = sc.nextInt();
			int x = sc.nextInt();
			if (t == 0) {
				Integer[] copy = Arrays.copyOfRange(arr, 0, x);
				Arrays.sort(copy);
				for(int j = 0; j < copy.length; j++) {
					arr[j] = copy[j];
				}
				//printArray(arr);
			}
			else if (t == 1) {
				Integer[] copy = Arrays.copyOfRange(arr, 0, x);
				
				Arrays.sort(copy, new Comparator<Integer>() {
					@Override
		            public int compare(Integer o1, Integer o2){
		                return o2.compareTo(o1);
					}
				});
				for(int j = 0; j < copy.length; j++) {
					arr[j] = copy[j];
				}
				//printArray(arr);
			}
		}
		printArray(arr);
		
	}
	
	public static void printArray(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length -1) {
				System.out.print(arr[i] + " ");
			}else{
				System.out.print(arr[i]);
				System.out.println();
			}
			
		}
	}

}
