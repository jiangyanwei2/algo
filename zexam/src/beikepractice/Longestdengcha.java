package beikepractice;

import java.util.*;

public class Longestdengcha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(calArithmeticSequence(arr));
    }
    public static int calArithmeticSequence(int[] nums){
        int length = nums.length;
        if(length == 0) return 0;
        Arrays.sort(nums);

        int diffMax = nums[length - 1] - nums[0];

        int[][] dp = new int[length][diffMax + 1];

        for(int i = 0; i < length; i++)
            for(int j = 0; j <= diffMax; j++)
                dp[i][j] = 1;
        int longestLength = 1;
        for(int i = 1; i < length; i++)
            for(int j = i - 1; j >= 0; j--){
                int temp = nums[i] - nums[j];
                dp[i][temp] = dp[j][temp] + 1;
                longestLength = Math.max(longestLength, dp[i][temp]);
            }
        return longestLength;
    }

}
