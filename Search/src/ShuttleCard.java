import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShuttleCard {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<List<Integer>> data = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> card = new ArrayList<>(); 
            for (int j = 0; j < 2*n; j++){
                card.add(sc.nextInt());
            }
            List<Integer> shuffledList = shuffle(k,card);
            for (Integer a : shuffledList) {
            	sb.append(a);
            	sb.append(" ");
            }
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
    public static List<Integer> shuffle(int k, List<Integer> card){
    	int n = card.size();
    	Integer[] help = new Integer[n];
        for (int j = 0; j < k; j++) {
        	int start = 0;
        	int mid = n/2;
		    for (int i = 0; i < n; i++){
		        help[i] = i % 2 == 0 ? card.get(start++):card.get(mid++);
//		        System.out.println(i + ":" + help[i]);
		    }
		    Integer[] copyHelp = Arrays.copyOf(help, n);
		    card = Arrays.asList(copyHelp);
//		    System.out.println(card);
        }
        return card;
    }

}
