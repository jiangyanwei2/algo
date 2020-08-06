package wangyi;

import java.util.*;
public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        Map<Integer, ArrayList<Integer>> party = new HashMap<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int f = sc.nextInt();
        set.add(f);
        for (int i = 0; i < m; i++) {
            int q = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < q; j++) {
                int e = sc.nextInt();
                list.add(e);
            }
            party.put(i, list);
        }
        int oldSize = 0;
        while(set.size() != oldSize) {
            oldSize = set.size();
            for (int i = 0; i < m; i++) {
                for (Integer e : party.get(i)) {
                    if(set.contains(e)) {
                        set.addAll(party.get(i));
                        break;
                    }
                }
            }
        }
        System.out.println(set.size());
    }
}
