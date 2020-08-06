package vivo;

import java.util.*;

public class Main1 {
	
	public static void main(String[] args) {
		//
		int[] A ={1,2,3,4,5};
		int[] B = {2,3,4,5,6};
		
		
		diff(A,B);
	}
	
	public static void diff(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					break;
				}
				if (j == b.length - 1) {
					System.out.print(a[i] + " ");
				}
			}

		}
		
	}

}
