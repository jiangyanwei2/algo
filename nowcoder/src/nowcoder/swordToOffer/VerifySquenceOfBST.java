package nowcoder.swordToOffer;

import java.util.Arrays;

public class VerifySquenceOfBST {
	public static boolean SquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length <=0)
            return false;
        int n = sequence.length;
        int root = sequence[n-1];
        int i = 0;
        for(;i < n-1; i++){
            if(sequence[i] > root)
                break;
        }
        for(int j = i;j < n-1;j++){
            if(sequence[j] < root)
                return false;
        }
        boolean left = true;
        boolean right = true;
        if (i > 0) {
        	left = SquenceOfBST(Arrays.copyOfRange(sequence,0,i));
        }
        if (i < n - 1) {
        	right = SquenceOfBST(Arrays.copyOfRange(sequence,i,n-1));
        }
        
        return (left && right);
    }
	public static void main(String[] args) {
		int [] sequence = new int[]{1,2,6,3,5};
		System.out.println(SquenceOfBST(sequence));
		
	}

}
