package bilibili;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        System.out.println(method(2019));
        
    }
    public static int method(int n){
        int ret = 0;
        int baseNum = 5;
        while (n >= baseNum)
        {
            ret += n/baseNum;
            baseNum *= 5;
        }
        return ret;
    }
}
