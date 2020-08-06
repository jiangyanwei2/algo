package yuanfudao;

import java.util.*;

public class Main1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        while(n > 0) {
        	String str = sc.nextLine().trim();
        	System.out.println(unzip(str));
        	--n;
        }
        
    }
	
	public static String unzip(String str) {
		char[] chars = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while (i < chars.length - 1) {
			if (chars[i] == '(') {
				StringBuilder word = new StringBuilder();
				i++;
				while (chars[i] != ')') {
					word.append(chars[i]);
					i++;
				}
				i++;
				String s = word.toString();
				sb.append(s);
				if (Character.isDigit(chars[i])) {
					int times = 0;
					while (Character.isDigit(chars[i])) {
						int digit = chars[i] - '0';
						times = times * 10 + digit;
						if (i < chars.length - 1) {
							i++;
						}else {
							break;
						}
					}
					times--;
					while (times > 0) {
						sb.append(s);
						--times;
					}
				}
				
			}
			else if (Character.isLetter(chars[i]) && Character.isDigit(chars[i + 1])) {
				int times = 0;
				char sh = chars[i];
				i++;
				while (Character.isDigit(chars[i])) {
					int digit = chars[i] - '0';
					times = times * 10+ digit;
					if (i < chars.length - 1) {
						i++;
					}else {
						break;
					}
				}
				while (times > 0) {
					sb.append(sh);
					--times;
				}
			}
			else {
				sb.append(chars[i]);
				i++;
			}
		}
		if (i == chars.length - 1 && Character.isLetter(chars[i])) {
			sb.append(chars[i]);
		}
		return sb.toString();
	}
}
