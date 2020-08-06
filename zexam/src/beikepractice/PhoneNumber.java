package beikepractice;

import java.util.*;

public class PhoneNumber {
    private static String[] map = {"","","abc","def","ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        printList(letterCombinations(str));
    }

    public static List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList<>();
        res.add("");
        for (int i = 0; i < digits.length(); i++) {
            String letters = map[digits.charAt(i) - '0'];
            while (i == res.peek().length()) {
                String t = res.remove();
                for (Character ch : letters.toCharArray()) {
                    res.add(t + ch);
                }
            }
        }
        return res;
    }

    public static void printList(List<String> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
                System.out.print("]");
                System.out.println();
            } else {
                System.out.print(list.get(i) + "," + " ");
            }
        }
    }
}
