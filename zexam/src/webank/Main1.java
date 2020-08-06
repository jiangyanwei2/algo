package webank;

import java.util.*;
public class Main1 {
	public static void main(String[] args) {
		int res = 1;
		int[] square = new int[7];
		Scanner sc = new Scanner(System.in);
		int C = 36;
		for (int i = 1; i < 7; i++) {
			square[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 1; i < 7; i++) {
			sum += square[i]*i*i;
		}
		res = sum/36;
		res = (int)Math.ceil(res);
		System.out.println(res);
		
	}

}
