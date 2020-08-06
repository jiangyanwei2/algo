package nowcoder;

public class Nixudui2 {

		  public static int InversePairs(int [] array) {
		        if(array==null||array.length==0)
		        {
		            return 0;
		        }
		        int[] copy = new int[array.length];
		        for(int i=0;i<array.length;i++)
		        {
		            copy[i] = array[i];
		        }
		        int count = InversePairsCore(array,copy,0,array.length-1);//数值过大求余
		        return count;
		         
		    }
		    private static int InversePairsCore(int[] array,int[] copy,int low,int high)
		    {
		        if(low==high)
		        {
		            return 0;
		        }
		        int mid = (low+high)>>1;
		        int leftCount = InversePairsCore(array,copy,low,mid)%1000000007;
		        int rightCount = InversePairsCore(array,copy,mid+1,high)%1000000007;
		        int count = 0;
		        int i=mid;
		        int j=high;
		        int indexCopy = high;
		        while(i>=low&&j>=mid+1)
		        {
		            if(array[i]>array[j])
		            {
		                count += j-mid;
		                copy[indexCopy--] = array[i--];
		                if(count>=1000000007)//数值过大求余
		                {
		                    count%=1000000007;
		                }
		            }
		            else
		            {
		                copy[indexCopy--] = array[j--];
		            }
		        }
		        while(i>=low)
		        {
		            copy[indexCopy--]=array[i--];
		        }
		        while(j>=mid+1)
		        {
		            copy[indexCopy--]=array[j--];
		        }
		        for(int k=low;k<=high;k++)
		        {
		            array[k] = copy[k];
		        }
		        return (leftCount+rightCount+count)%1000000007;
		    }
		    
		    public static void main(String[] args) {
				 int[] array={1,2,3,4,5,6,7,0};
		         
			     System.out.println(InversePairs(array));
			}

}
