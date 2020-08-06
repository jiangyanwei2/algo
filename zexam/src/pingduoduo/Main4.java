package pingduoduo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//10
//1 2 3 4 5 6 7 8 9 10
//1 1 1 1 1 1 1 1 1 10

public class Main4 {
	private static class Block {
		private int length;
		private int weight;
		public Block(int length, int weight) {
			this.length = length;
			this.weight = weight;
		}
	}
	
	//N- 件数，V-容量，w-费用，v-价值
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Block[] arr = new Block[N];
		int[][]dp = new int[N + 1][N + 1];
		int res = 0;
		String noUse = sc.nextLine();
		String sLength = sc.nextLine().trim();
		String sWeight = sc.nextLine().trim();
		int[] length_array = stringToArray(sLength);
		int[] weight_array = stringToArray(sWeight);
		for (int i = 0; i < length_array.length; i++) {
			arr[i] = new Block(length_array[i], weight_array[i]);
		}
		Arrays.sort(arr, new Comparator<Block>() {
			@Override
			public int compare(Block o1, Block o2) {
				return o1.length - o2.length;
			}
		});
		for (int i = 0; i < N ; i++) {
			for (int k = 0; k < i; k++) {
				if (arr[k].length < arr[i].length) {
					for (int j = 0; j < k + 1; j++) {
						if (dp[k][j] <= 7 * arr[i].weight) {
							dp[i][j + 1] = 	Math.min(dp[i][j + 1], dp[i][j] + arr[i].weight);
							res = Math.max(res, j + 1);
						}
					}
				}
				
			}
		}
		System.out.println(res);
	}
	
	public static int[] stringToArray(String s) {
	    String[] s_arr = s.split(" ");
        int[] res = new int[s_arr.length];
        for (int i = 0; i < s_arr.length; i++) {
        	res[i] = Integer.valueOf(s_arr[i]);
        }
        return res;
}

}
