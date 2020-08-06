package nowcoder.swordToOffer;

public class PuKePaiShunZi {
	public static boolean isContinuous(int [] numbers) {
        if (numbers == null || numbers.length < 5){
            return false;
        }
        sort(numbers);
        int numOfZero = 0;
        int numOfGap = 0;
        for (int i = 0; i < numbers.length; i++){
            //统计0的个数
            if (numbers[i] == 0){
                numOfZero++;
            }
        }
        for (int j = numOfZero; j < numbers.length - 1; j++){
        	 if (numbers[j+1] - numbers[j] < 1){
                 return false;
             }else{
                 numOfGap += numbers[j+1] - numbers[j] - 1;
             }
        }
        return numOfGap > numOfZero ? false :true;
    }
    
    private static void sort(int[] num){
        if (num == null || num.length == 0){
            return;
        }
        for (int e = num.length - 1; e > 0; e--){
            for (int i = 0; i < e; i++){
                if (num[i] > num[i + 1]){
                    swap(num, i, i + 1);
                }
            }
        }
    }
    
    private static void swap(int[] num, int i, int j){
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }
    
    public static void main(String[] args) {
    	int [] numbers = {0,0,1,4,6};
    	System.out.println(isContinuous(numbers));
	}

}
