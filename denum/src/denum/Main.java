package denum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number;
		int count = 0;
		int result=0,digit;
		int wei,fen;
		int flag;
		double quan;
	Scanner in = new Scanner(System.in); 
	number = in.nextInt();
	do {
		digit=number%10;
		count++;
		wei=count%2;
		fen=digit%2;
		if(wei==fen)
		flag=1;
		else
		flag=0;
		quan=Math.pow(2, count-1);
		result=flag*(int)quan+result;
		number=number/10;	
			
	}while(number>0);
	 System.out.println(result);
		
		
		
			
	}
}
