package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fw;
		Scanner in = new Scanner(System.in); 
		fw = in.nextInt();
         System.out.println((int)(5.0/9.0*(fw-32)));
         in.close();
	}

}
