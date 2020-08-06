package guanlianda;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         int N = sc.nextInt();
         int res = (2 * N - 2) *(2 * N - 2);

      System.out.println(res);

         sc.close();
    }
}
