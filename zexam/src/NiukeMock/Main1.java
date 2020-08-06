package NiukeMock;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[6];
		int a = 0;
		int b = 0;
		for (int i = 0; i < 6; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			a += arr[i];
		}
		for (int i = 3; i < 6; i++) {
			b += arr[i];
		}
		int diff = a - b;
		int[] num = new int[14];
		Arrays.fill(num, 4);
		for (int i = 0; i < 6; i++) {
			for (int j = 1; j < 14; j++) {
				if (arr[i] == j) {
					num[j]--;
				}
			}
		}
		
		int numerator = 0;
		int denominator = 45*46;
		int[] temp = new int[14];
		for (int i = 1; i < 14; i++) {
			temp[i] = temp[i - 1] + num[i];
		}
		if (diff > 0) {
			for (int i = 1; i < 14; i++) {
				numerator += (temp[Math.min(13, i + diff - 1)] - 1)*num[i];
			}
		}else {
			for (int i = 1; i < 14; i++) {
				numerator += (temp[Math.max(0, i + diff - 1)])*num[i];			
			}
		}
		
		System.out.println(String.format("%.4f\n", 1.0 * numerator / denominator));
	}
}
