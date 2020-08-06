package duxiaoman;

import java.util.*;
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] prices = new int[n];
		int[] res = new int[2];
		for (int i = 0; i < n; i++) {
			prices[i] = sc.nextInt();
		}
		maxProfit(prices, res);
		System.out.println(res[0] + " " +res[1]);
	}
	
	
	
	public static void maxProfit(int[] prices, int[] res) {
		int maxprofit = 0;
		int times = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
                times++;
        }
        res[0] = maxprofit;
        res[1] = times;
        
    }

}
