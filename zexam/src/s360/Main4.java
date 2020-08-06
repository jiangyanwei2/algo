package s360;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        int[] map  = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            map[index]++;
        }
        int res = 0;
        for (int i = 0; i < 26; i++) {
            if (map[i] > res) {
                res = map[i];
            }
        }
        System.out.println(res);
    }
}
