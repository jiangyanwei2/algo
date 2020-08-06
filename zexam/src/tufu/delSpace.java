package tufu;

import java.util.Scanner;

public class delSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(del(line));
    }

    public static String del(String str) {
        char[] ch = str.toCharArray();
        int j = -1;
        int i = 0;
        while (i < ch.length) {
            if (ch[i] == ' ') {
                while(ch[i]== ' ') {
                    i++;
                }
            }
            j++;
            ch[j] = ch [i];
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k <= j; k++) {
            sb.append(ch[k]);
        }
        return sb.toString();
    }
}
