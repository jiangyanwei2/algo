package xiecheng;

import java.util.*;
public class Main2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] node = input.split(",");
		System.out.println(hasCircle(node));
		
	}
	
	private static boolean hasCircle(String[] node) {
		Set<String> set = new HashSet<>();
		for (int i = 0; i < node.length; i++) {
			if (!set.contains(node[i])) {
				set.add(node[i]);
			}else {
				return true;
			}
		}
		return false;
	}

}
