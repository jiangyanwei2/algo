package nowcoder.swordToOffer;

import java.util.ArrayList;

public class ContinuousSequenceOfSum {
	public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer> > res = new ArrayList<>();
        if (sum < 3){
            return res;
        }
        int left = 1;
        int right = 2;
        int end = (sum + 1) >> 1;
        int curSum = left + right;
        while (left < right && right <= end){
            if (curSum == sum){
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = left; i <= right; i++){
                    list.add(i);
                }
                res.add(list);
                right++;
                curSum = curSum - left + right;
                left++;
                continue;
            }
            else if (curSum < sum){
                right++;
                curSum += right;
            }else{
                curSum -= left;
                left++;
            }
        }
        return res;
    }
	public static void main(String[] args) {
		System.out.println(FindContinuousSequence(15));
	}

}
