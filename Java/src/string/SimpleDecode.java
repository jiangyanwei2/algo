package string;

import java.util.Scanner;

public class SimpleDecode {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(deCode(str));
    }
    
    public static String deCode(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Y' ) {
                sb.append((char) (str.charAt(i) + 'a' - 'A' + 1));
            }
            else if (str.charAt(i) == 'Z') {
                sb.append('a');
            }
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'c') {
                sb.append(2);
            }
            else if (str.charAt(i) >= 'd' && str.charAt(i) <= 'f') {
                sb.append(3);
            }
            else if (str.charAt(i) >= 'g' && str.charAt(i) <= 'i') {
                sb.append(4);
            }
            else if (str.charAt(i) >= 'j' && str.charAt(i) <= 'l') {
                sb.append(5);
            }
            else if (str.charAt(i) >= 'm' && str.charAt(i) <= 'o') {
                sb.append(6);
            }
            else if (str.charAt(i) >= 'p' && str.charAt(i) <= 's') {
                sb.append(7);
            }
            else if (str.charAt(i) >= 't' && str.charAt(i) <= 'v') {
                sb.append(8);
            }
            else if (str.charAt(i) >= 'w' && str.charAt(i) <= 'z') {
                sb.append(9);
            }
           else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

}
