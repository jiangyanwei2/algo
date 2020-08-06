package xiecheng;

import java.util.*;
public class Main3 {
	

	    private class Node{

	        public boolean isWord;
	        public TreeMap<String, Node> next;

	        public Node(boolean isWord){
	            this.isWord = isWord;
	            next = new TreeMap<>();
	        }

	        public Node(){
	            this(false);
	        }
	    private Node root;
	    private int size;
}
	   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int n = Integer.parseInt(input[0]);
		for (int i = 1; i <= n; i++) {
			String[] path = input[i].split("/");
			for(int j = 1; j < path.length; j++) {
				System.out.print("1");
			}
			System.out.print(" ");
		}
		
	}

}
