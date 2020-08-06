package shopee;

import java.util.*;

public class Main2 {
    private static final int[] arr = {1, 2, 4, 5, 10, 20};

    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        backtrack(list, new ArrayList<Integer>(), arr, sum, 0);
        printList(list);
        //System.out.println(min);
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] cand, int remain, int start) {

        if (remain < 0) return;
        else if (remain == 0) list.add(new ArrayList<>(tempList));
        else {
            for (int i = start; i < cand.length; i++) {
                if (i > start && cand[i] == cand[i - 1]) continue;
                tempList.add(cand[i]);
                backtrack(list, tempList, cand, remain - cand[i], i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void printList(List<List<Integer>> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i).size());
                System.out.println();
            } else {
                System.out.print(list.get(i).size() + " ");
            }
        }
    }

}
