package duxiaoman;
import java.util.*;
public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			System.out.println(numMood(num));
		}
	}
	
	
	public static String numMood(int num) {
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		int len = 0;
		int numCopy = num;
		while(numCopy > 0) {
			int digit = numCopy % 10;
			list.add(digit);
			numCopy = numCopy / 10;
			len++;
		}
		for (Integer i : list) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == len) {
			return "G";
		}
		else if (count == 0) {
			return "S";
		}else {
			return "H";
		}
		
	}
	
	

}
