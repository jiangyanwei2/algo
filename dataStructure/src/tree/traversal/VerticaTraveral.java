package tree.traversal;

import java.util.*;


public class VerticaTraveral {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
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
        TreeNode head = new TreeNode(5);
        head.left = new TreeNode(3);
        head.right = new TreeNode(8);
        head.left.left = new TreeNode(2);
        head.left.right = new TreeNode(4);
        head.left.left.left = new TreeNode(1);
        head.right.left = new TreeNode(7);
        head.right.left.left = new TreeNode(6);
        head.right.right = new TreeNode(10);
        head.right.right.left = new TreeNode(9);
        head.right.right.right = new TreeNode(11);
        List<List<Integer>> list = vertical(head);

    }

    public static List<List<Integer>> vertical(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> nodeQueue = new LinkedList<>();
        LinkedList<Integer> col = new LinkedList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        if (root == null) {
            return res;
        }
        nodeQueue.offer(root);
        col.offer(0);
        int minLevel = Integer.MAX_VALUE;
        int maxLevel = Integer.MIN_VALUE;
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.poll();
            int level = col.poll();
            minLevel = Math.min(minLevel, level);
            maxLevel = Math.max(maxLevel, level);
            if (!map.containsKey(level)) {
                List<Integer> list = new ArrayList<>();
                list.add(node.val);
                map.put(level, list);
            } else {
                map.get(level).add(node.val);
            }

            if (node.left != null) {
                nodeQueue.add(node.left);
                col.add(level - 1);
            }
            if (node.right != null) {
                nodeQueue.add(node.right);
                col.add(level + 1);
            }
        }
        for (int i = minLevel; i <= maxLevel; i++) {
            if (map.containsKey(i)) {
                res.add(map.get(i));
                System.out.println(i + ":" + map.get(i).toString());
            }
        }
        return res;
    }
}
