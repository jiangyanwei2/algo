import java.util.Scanner;

public class ShuttleCard2 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] card = new int[2*n];
            for (int j = 0; j < 2*n; j++){
                int tmp = j;
                for (int m = 0; m < k; m++) {
                    if (tmp < n ){
                        tmp = 2 * tmp;
                    }else{
                        tmp = 2 *(tmp + 1 - n) - 1;
                    }
                }
                card[tmp] = sc.nextInt();
            }
            if (card.length > 0){
                System.out.print(card[0]);
            }
            for (int t = 1; t < 2*n; t++){
                System.out.print(" " + card[t]);
            }
            System.out.println();
        }
    }

}
