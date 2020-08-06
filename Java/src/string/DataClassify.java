package string;

import java.util.Scanner;
import java.util.TreeSet;

public class DataClassify {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        String[] I = new String[m];
        for (int i = 0; i < m; i++) {
            I[i] = sc.next();
        }
        int n = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        System.out.println(handle(I,set));
    }
    
    public static String handle(String[] I, TreeSet<Integer> set){
        int size = 0;
        StringBuilder sb = new StringBuilder();
        for (Integer a :set) {
            int count = 0;
            boolean isContain = false;
            String s = a.toString();
            
            for (int i = 0; i < I.length; i++) {
                if (s.contains(I[i])) {
                    count++;
                    sb.append(i + " ");
                    sb.append(I[i] + " ");
                }
            }
            size += 2 + 2*count;
            sb.insert(0, count + " ");
            sb.insert(0, s + " ");
        }
        sb.insert(0, size + " ");
        return sb.toString();
    }

}
