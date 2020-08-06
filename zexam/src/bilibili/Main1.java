package bilibili;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine().trim();
            System.out.println(reverseSentence(str));
        }

    }

    public static String reverseSentence(String str) {
        if(str == null || str.trim().length() == 0)
            return str;
        char[] chars = str.toCharArray();
        int len = chars.length;
        reverse(chars,0,len-1);
        int begin = 0;
        int end = 0;
        while(begin != len){
            if(chars[begin] == ' '){
                begin++;
                end++;
            }
            if(chars[end] == ' '){
                reverse(chars,begin,end-1);
                begin = ++end;
            }
            if( end == len-1){
                reverse(chars,begin,end);
                begin = ++end;
            }
            else{
                end++;
            }
        }
        return String.valueOf(chars);

    }

    public static void reverse(char[] str, int start, int end){
        char temp;
        while(start < end){
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}
