package liulishuo;

import java.util.*;

public class Main1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        HuffmanNode root = creatHTree(s);
	        int res = getLength(root, 0);
	        System.out.println(res);
	    }
	 
	 public static HuffmanNode creatHTree(String s) {
		 char[] charr = s.toCharArray();
		 HashMap<Character, Integer> map = new HashMap<>();
		 PriorityQueue<HuffmanNode> queue = new PriorityQueue<>(new Comparator<HuffmanNode>() {
			 @Override
			 public int compare(HuffmanNode o1, HuffmanNode o2) {
				 return o1.weight - o2.weight;
			 }
		 });
		 for (int i = 0; i < charr.length; i++) {
			 if (map.containsKey(charr[i])) {
				 map.put(charr[i], map.get(charr[i]) + 1);
			 } else {
				 map.put(charr[i], 1);
			 }
		 }
		 for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			 queue.offer(new HuffmanNode(entry.getValue(), entry.getKey()));
		 }
		 while (queue.size() > 1) {
			 HuffmanNode leftNode = queue.poll();
			 HuffmanNode rightNode = queue.poll();
			 HuffmanNode parentNode = new HuffmanNode(leftNode.weight + rightNode.weight);
			 parentNode.left = leftNode;
			 parentNode.right = rightNode;
			 queue.offer(parentNode);
		 }
		 HuffmanNode root = queue.poll();
		 return root;
	 }
	 
	 public static int getLength(HuffmanNode node, int depth) {
		 if (node == null) {
			 return 0;
		 }
		 
		 return (node.ch == null ? 0 : node.weight) * depth + getLength(node.left, depth + 1) + getLength(node.right, depth + 1);
	 }
	 
	static class HuffmanNode{
		 int weight;
		 HuffmanNode left;
		 HuffmanNode right;
		 Character ch;
		 public HuffmanNode(int weight) {
			 this.weight = weight;
		 }
		 
		 public HuffmanNode(int weight, char ch) {
			 this.weight = weight;
			 this.ch = ch;
		 }
	 }

}
