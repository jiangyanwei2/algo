package kuaishou;
import java.util.*;
public class Main3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> tree = new ArrayList<>();
		while (sc.hasNext()) {
			tree.add(sc.nextInt());
			
		}
		//Integer[] array = (Integer[])tree.toArray();
		if (isBST(tree)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
        
		
	}
	
	public static boolean isBST(ArrayList<Integer> tree) {
		if (tree == null || tree.size() == 0) {
			return true;
		}
		for (int i = 0; (2 * i + 2)< tree.size(); i++) {
			if (tree.get(i) != null) {
				if (tree.get(i) <=tree.get(2*i + 1) ||  tree.get(i) >= tree.get(2*i + 2)) {
					return false;
				}
			}
		}
		return true;
	}

}
