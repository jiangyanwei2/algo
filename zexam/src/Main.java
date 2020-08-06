
import java.util.*;
public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = "123";
        String newStr = str.substring(0, str.length());
        String[] a = str.split(",");

        System.out.println(newStr);
    }
}
