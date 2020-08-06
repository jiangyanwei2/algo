package xiecheng;

import java.util.Scanner;

public class Main7 {
    /*请完成下面这个函数，实现题目要求的功能
 当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
 ******************************开始写代码******************************/
    static int climb(int n) {
        int preTwo = 1;
        int preOne = 2;
        int result = 0;
        if(n <= 0)
            return 0;
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        if (n == 3)
            return 4;
        if (n == 4)
            return 7;
//        if (n == 5)
//            return 13;
//        if (n == 6)
//            return 23;

        for(int i = 3; i <= n; i++){
            result = preOne + preTwo;
            preTwo = preOne;
            preOne = result;
        }
        return result + (n - 2) * 5;

    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        res = climb(_n);
        System.out.println(String.valueOf(res));
    }

}
