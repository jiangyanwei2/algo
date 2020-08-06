package nowcoder.swordToOffer;

public class Nixudui {
	public static int InversePairs(int [] array) {
        if (array == null || array.length < 2){
            return 0;
        }
        int[] copy = new int[array.length];
        for(int i = 0; i < array.length; i++)
        {
            copy[i] = array[i];
        }
        return InversePairsCore(array, copy, 0, array.length - 1);
    }
    
    private static int InversePairsCore(int[] array, int[] copy, int left, int right){
        if (left == right){
            return 0;
        }
        int mid = (left + right) >> 1;
        int lcount = InversePairsCore(array,copy, left, mid);
        int rcount = InversePairsCore(array,copy, mid + 1, right);
        int i = mid;
        int j = right;
        int count = 0;
        int indexCopy = right;
        while (i >= left && j >= mid+1){
            if (array[i] > array[j]){
            	count += j - mid;
            	copy[indexCopy--] = array[i--];
                
            }else{
            	copy[indexCopy--] = array[j--];
            }
            while(i >= left){
            	copy[indexCopy--] = array[i--];
            }
            while( j >= mid + 1){
            	copy[indexCopy--] = array[j--];
            }
            for (int k = left; k <= right; k++){
                array[k] = copy[k];
            }
            
        }
        return (lcount + rcount + count)%1000000007;
    }
	 public static void main(String[] args) {
		 int[] array={1,2,3,4,5,6,7,0};
         
	     System.out.println(InversePairs(array));
	}
}
