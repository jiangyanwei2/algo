package nowcoder.swordToOffer;

public class MoreThanHalfNumberInArray {
	public int MoreThanHalfNum_Solution(int [] array) {
        if (array == null || array.length == 0){
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        int mid = (left + right) >> 1;
        int index = Partition(array, left, right);
        while(index != mid){
            if (index > mid){
                right = index - 1;
                index = Partition(array, left,right);
            }else{
                left = index + 1;
                index = Partition(array, left,right);
            }
        }
        int res = array[mid];
        if (!MoreThanHalf(array,res)){
            return 0;
        }
        return res;
    }
    
    private int Partition(int[] array, int left, int right){
        int pivot = array[left];
        int i = left;
        int j = right;
        while(i < j){
            while(i < j && array[i+1] <= pivot){
                i++;
            }
            while(i < j && array[j] >= pivot){
                j--;
            }
            swap(array, i, j);
        }
        swap(array, left, j);
        return j;
    }
    
    private boolean MoreThanHalf(int[] array, int num){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == num){
                count++;
            }
        }
        return 2*count > array.length;
    }
    private void swap(int[] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    public static void main(String[] args) {
    	MoreThanHalfNumberInArray s = new MoreThanHalfNumberInArray();
    	int[] array = {1,2,3,2,2,2,5,4,2};
    	System.out.println(s.MoreThanHalfNum_Solution(array));
	}
}
