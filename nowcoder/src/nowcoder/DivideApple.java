package nowcoder;

import java.util.Scanner;

public class DivideApple {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] apple = new int[n];
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < n; i++){
            apple[i] = sc.nextInt();
            sum += apple[i];
        }
        int avg = sum/n;
        if (canDivide(apple, sum)){
            for(int i = 0; i < n; i++){
                count = count + (Math.abs(apple[i] - avg) / 2);
                System.out.println(count);
            }
            
            //System.out.println(count);
        }else{
            System.out.println(-1);
        }

    }
    public static boolean canDivide(int[] apple, int sum){
        int n = apple.length;
        int avg = sum/n;
        if (avg * n == sum){
            for(int i = 0; i < n; i++){
            if(Math.abs(apple[i] - avg) %2 != 0){
                return false;
                }
            }
        return true;
        }
        return false;
    }

}
