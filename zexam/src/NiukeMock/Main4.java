package NiukeMock;

import java.util.*;
public class Main4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countString(s));
    }
    
    private static int countString (String s) {
    	int res = 1;
    	int[] arr = new int[26];
    	for (int i = 0; i < s.length(); i++) {
    		char ch = s.charAt(i);
    		int j = (int)(ch - 'a');
    		arr[j]++;
    	}
    	
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] % 2 == 1) {
    			arr[i]--;
    			break;
    		}
    	}
    	for (int i = 0; i < arr.length; i++) {
    		arr[i] %= 2;
    	}
    	
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] % 2 == 1) {
    			res++;
    		}
    	}
    	return res;
    }
    
}
