package nowcoder;

import java.util.Arrays;
import java.util.Scanner;

public class CatchBall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int ans = 0;
		int i = n - 1;
		int j = n - 1;
		while (i > 0 && j > 0)
	    {
			if (arr1[i] > arr2[j]) {
				ans += arr1[i--];
			}else {
				j--;
			}
			if (arr2[j] > arr1[i]) {
				ans -= arr2[j--];
			}else {
				i--;
			}
		}
		if (arr1[i] > arr2[j]) {
			ans += arr1[i] - arr2[j];
		}
		System.out.println(ans);
	}

}
