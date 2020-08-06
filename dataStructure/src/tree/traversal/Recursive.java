package tree.traversal;

import java.util.Stack;

public class Recursive {
	public static class Node {
		private int value;
		private Node left;
		private Node right;
		public Node(int value) {
			this.value = value;
		}
	}
	
	public static void preOrderRecur(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.value+ " ");
		preOrderRecur(root.left);
		preOrderRecur(root.right);
		
	}
	
	public static void inOrderRecur(Node root) {
		if (root == null) {
			return;
		}
		inOrderRecur(root.left);
		System.out.print(root.value+ " ");
		inOrderRecur(root.right);
		
	}
	
	public static void posOrderRecur(Node root) {
		if (root == null) {
			return;
		}
		posOrderRecur(root.left);
		posOrderRecur(root.right);
		System.out.print(root.value+ " ");
		
	}
	
	public static void preOrderUnRecur(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> stack = new Stack<>();
		while ((root !=null) || (!stack.isEmpty())) {
			while (root != null) {
				stack.push(root);
				System.out.print(root.value + " ");
				root = root.left;
			}
			if (!stack.isEmpty()) {
				root = stack.pop();
				
				root = root.right;
			}
		}
	}
	
	public static void preOrderUnRecur1(Node root) {
		if (root != null) {
			Stack<Node> s = new Stack<Node>();
			
			s.push(root);
			while (!s.isEmpty()) {
				root = s.pop();
				System.out.print(root.value + " ");
				if (root.right != null) {
					s.push(root.right);
				}
				if (root.left != null) {
					s.push(root.left);
				}
			}
		}
	}
	
	public static void inOrderUnRecur(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> stack = new Stack<>();
		while ((root !=null) || (!stack.isEmpty())) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			if (!stack.isEmpty()) {
				root = stack.pop();
				System.out.print(root.value + " ");
				root = root.right;
			}
		}
	}
	
	public static void posOrderUnRecur(Node root) {
		if (root != null) {
			Stack<Node> s1 = new Stack<Node>();
			Stack<Node> s2 = new Stack<Node>();
			s1.push(root);
			while (!s1.isEmpty()) {
				root = s1.pop();
				s2.push(root);
				if (root.left != null) {
					s1.push(root.left);
				}
				if (root.right != null) {
					s1.push(root.right);
				}
			}
			while (!s2.isEmpty()) {
				System.out.print(s2.pop().value + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		/*
		 *       5
		 *     /   \
		 *    3     8
		 *   / \    /\
		 *  2   4   7 10
		 *  /      /   /\
		 * 1       6  9 11
		 *   
		 * */
		Node head = new Node(5);
		head.left = new Node(3);
		head.right = new Node(8);
		head.left.left = new Node(2);
		head.left.right = new Node(4);
		head.left.left.left = new Node(1);
		head.right.left = new Node(7);
		head.right.left.left = new Node(6);
		head.right.right = new Node(10);
		head.right.right.left = new Node(9);
		head.right.right.right = new Node(11);

		// recursive
		System.out.println("==============recursive==============");
		System.out.print("pre-order: ");
		preOrderRecur(head);
		System.out.println();
		System.out.print("in-order: ");
		inOrderRecur(head);
		System.out.println();
		System.out.print("pos-order: ");
		posOrderRecur(head);
		System.out.println();
		System.out.println("============unrecursive=============");
		System.out.print("pre-order: ");
		preOrderUnRecur(head);
		System.out.println();
		System.out.print("in-order: ");
		inOrderUnRecur(head);
		System.out.println();
		System.out.print("pos-order: ");
		posOrderUnRecur(head);
		System.out.println();
	}
}
