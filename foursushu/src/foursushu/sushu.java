package foursushu;

import java.util.Scanner;

public class sushu {
	public static void main(String[] args) {
		int count=1;
		int sum=0;
		int [] sushu= new int[201];
		sushu[0]=0;
//		Scanner in = new Scanner(System.in); 
//	    int n = in.nextInt();
//		int m = in.nextInt();
		for(int a=2;count<=200;a++)
		{
			boolean isPrime=true;
			
			
			for(int i=2;i<=a;i++)
			{
					if(a%i==0)
					{
						isPrime=false;
						break;
				    }
				
			}
			if(isPrime==true) 
			{
				sushu[count]=a;
				count++;
			}	
		}
		for(int i=1;i<sushu.length;i++)
		{
			System.out.println(sushu[i]);
			
		}
//		for(int i=n;i<=m;i++) 
//		{
//			sum=sum+sushu[i];
//		}
//		System.out.println(sum);
	}

}
