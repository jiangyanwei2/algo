package kuaishou;
import java.util.*;
public class Main4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] num = input.split(",");
		int[] tree = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			try {
				tree[i] = Integer.parseInt(num[i]);
			} catch (Exception e) {
				tree[i] = -1;
			}
			}
			

		if (isBST(tree)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
	
	public static boolean isBST(int[] tree) {
		if (tree == null || tree.length == 0) {
			return true;
		}
//		for (int i = 1;  i < tree.length; i++) {
//			if (tree[i] == - 1 && tree[i + 1] == tree[i]) {
//				
//			}
//		}
		for (int i = 0; (2 * i + 2)< tree.length; i++) {
			if (tree[2*i + 1] !=-1 && tree[2*i + 2] !=-1) {
				if (tree[i] <=tree[2*i + 1] ||  tree[i] >= tree[2*i + 2]) {
					return false;
				}
			}
		}
		return true;
	}

}
