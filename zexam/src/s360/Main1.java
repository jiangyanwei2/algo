package s360;
import java.util.*;
public class Main1 {
	
	public static void main(String[] args) {
//		System.out.println(new Integer(2) == 2);
//		System.out.println(new Integer(2) == new Integer(2));
//		System.out.println(Integer.valueOf(2) == Integer.valueOf(2));
//		System.out.println(Integer.valueOf(1024) == new Integer(1024));
//		System.out.println(new Float(2.2).equals(new Float(2.20)));

		String a = new String("abc");
		String b = new String("abc");
		String c = "abc";
		String d = "abc";
		System.out.println(a == b);
		System.out.println(b == c);
		System.out.println(c == d);
		String astr = "?One?";
		astr.toLowerCase();
		System.out.println(astr);
	}

}
