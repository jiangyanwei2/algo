package NiukeMock;

import java.util.*;
public class Main3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(decreaseEnd(s));
    }
    
    private static int decreaseEnd (String s) {
    	for (int i = s.length() - 1; i > 0; i--) {
    		if (isEvenString(s.substring(0, i))) {
    			return i;
    		}
    	}
    	return 1;
    }
    private static boolean isEvenString(String s) {
    	String front = s.substring(0, s.length() / 2);
    	String end = s.substring(s.length()/2, s.length());
    	return front.equals(end);
    }
}
