package nowcoder;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Queuen {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++){
            int n = sc.nextInt();
            List<Integer> list = construct(n);
            StringBuilder sb = new StringBuilder();
            for(Integer e : list){
                sb.append(e);
                sb.append(" ");
            }
            sb.setLength(sb.length() - 1);
            System.out.println(sb);
        }
        
    }
    
    public static List<Integer> construct(int n){
        LinkedList<Integer> q = new LinkedList<>();
        for (int i = n; i > 0; i--) {
            q.addFirst(i);
            int x = q.pollLast();
            q.addFirst(x);
            System.out.println(q);
        }
        return q;
    }

}
