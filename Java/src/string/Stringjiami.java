package string;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Stringjiami {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        String data = sc.nextLine();
        System.out.println(encrypt(key,data));
    }
    
    public static String encrypt(String key, String data) {
        Set<Character> set = new LinkedHashSet<>();
        key = key.toUpperCase();
        StringBuilder sb = new StringBuilder();
        for(char ch : key.toCharArray()) {
            set.add(ch);
        }
        for (int i = 65; i <= 90; i++) {
            set.add((char)i);
        }
        int j = 65;
        Map<Character,Character> map = new LinkedHashMap<>();
        for (Character value: set) {
            map.put((char)j,value);
            j++;
        }
        for (char ch : data.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append(map.get(ch));
            }else if (Character.isLowerCase(ch)) {
                sb.append(Character.toLowerCase(map.get(Character.toUpperCase(ch))));
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }

}
