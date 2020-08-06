package shopee;

import java.util.*;

public class Main1 {
    private static final String[] letterMap = new String[] { "","abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx","yz"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String digits = sc.nextLine().trim();
        LinkedList<String> list = letterCombinations(digits);
        printList(list);

    }


    public static LinkedList<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            String letters = letterMap[digits.charAt(i) - '0'];
            while (i == result.peek().length()) {
                String t = result.remove();
                for (char c : letters.toCharArray()) {
                    result.add(t + c);
                }
            }
        }
        return result;
    }

    public static void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
                System.out.println();
            } else {
                System.out.print(list.get(i) + " ");
            }
        }
    }

}
