package vivo;

import java.util.*;

public class Main2 {
	
	public static void main(String[] args) {
		int[] price = {200, 600, 100, 180, 300, 450};
		int[] hot = {6, 10, 3, 4, 5, 8};
		int total = 1000;
		dpp(total, price, hot);
	}
	public static void dpp(int total, int[] price, int[] hot) {
		int[] dp = new int[total + 1];
		for (int i = 0; i < price.length; i++) {
			for (int j = total; j >= price[i]; j--) {
				dp[j] = Math.max(dp[j], dp[j-price[i]] + hot[i]);
			}
		}
		System.out.println(dp[total]);
	}

}
