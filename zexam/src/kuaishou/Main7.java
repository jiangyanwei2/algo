package kuaishou;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String str = "http://google.ru";
        String sub = str.substring(7);
        int index = sub.indexOf('/');
        System.out.println(index);
    }
}
