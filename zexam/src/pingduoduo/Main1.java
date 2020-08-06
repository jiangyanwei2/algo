package pingduoduo;

import java.util.*;
public class Main1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sa = sc.nextLine();
        String sb = sc.nextLine();
        int[] A = stringToArray(sa);
        int[] B = stringToArray(sb);
        int ele = 0;
        int index = 0;
        int prev = 0;
        int after = 0;
        if (A.length == 2) {
        	after = A[1];
        	A[0] = searchAfter(B,prev,after);
        	if (A[0] == - 1) {
    			System.out.println("NO");
    		}else {
    			printArray(A);
    		}
        }
        if (A[1] - A[0] < 0 && A[2] - A[0] < 0) {
    		ele = A[0];
    		index = 0;
    		after = A[1];
    		A[0] = searchAfter(B, prev, after);
    		if (A[0] == - 1) {
    			System.out.println("NO");
    		}else {
    			printArray(A);
    		}
    	}
    	else if (A[A.length - 1] - A[A.length - 2] < 0) {
    		ele = A[A.length - 1];
    		index = A.length - 1;
    	    prev = A[A.length - 2];
    	    A[index] = searchPrev(B,prev);
    		if (A[index] == - 1) {
    			System.out.println("NO");
    		}else {
    			printArray(A);
    		}
    	}
    	else {
            for (int i = 0; i < A.length - 1; i++) {
            	if (A[i + 1] - A[i] <= 0) {
            		ele = A[i + 1];
            		index = i + 1;
            		prev = A[i];
            		after = A[i+2];
            		break;
            	}
            }
            A[index] = searchAfter(B,prev, after);
    		if (A[index] == - 1) {
    			System.out.println("NO");
    		}else {
    			printArray(A);
    		}
    	}

        
        
    }
	
	public static int[] stringToArray(String s) {
		    String[] s_arr = s.split(" ");
	        int[] res = new int[s_arr.length];
	        for (int i = 0; i < s_arr.length; i++) {
	        	res[i] = Integer.valueOf(s_arr[i]);
	        }
	        return res;
	}
	
	public static int searchPrev(int[] B, int ele) {
		for (int i = B.length - 1; i >= 0; i++) {
			if (B[i] > ele) {
				return B[i];
			}
		}
		return -1;
	}
	
	public static int searchAfter(int[] B, int prev, int after) {
		for (int i = B.length - 1; i > 0; i--) {
			if (B[i] < after && B[i] > prev) {
				return B[i];
			}
		}
		return -1;
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i]);
				System.out.println();
			} else {
				System.out.print(array[i] + " ");
			}
		}
	}
	
}
