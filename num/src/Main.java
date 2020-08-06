import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(reverseString(str));
        }
    }
    
    private static String reverseString(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] chars = str.toCharArray();
        int len = chars.length;
        reverseWord(chars, 0, len - 1);
        int begin = 0;
        int end = 0;
        while(begin != len){
            if(chars[begin] == ' '){
                begin++;
                end++;
            }
            else if(chars[end] == ' '){
                reverseWord(chars,begin,end-1);
                begin = ++end;
            }
            else if( end == len-1){
                reverseWord(chars,begin,end);
                begin = ++end; 
            }
            else{
                end++;
            }
        }
        return String.valueOf(chars);
    }
    
    private static void reverseWord(char[] str, int start, int end) {
        char temp;
        while (start < end) {
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}