package amazon;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedHashMap<Integer, ArrayList<Integer>> map = new LinkedHashMap<>(16, 0.75f,true);
        for (int i = 0; i < n; i++) {
            int company = sc.nextInt();
            int price = sc.nextInt();
            if (!map.containsKey(company)) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(price);
                map.put(company,list);
            } else {
                map.get(company).add(price);
            }
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int num = sc.nextInt();
            int[] delCompany = new int[num];
            for (int j = 0; j < num; j++) {
                delCompany[j] = sc.nextInt();
            }
            int[] res = query(new LinkedHashMap<>(map), delCompany);
            System.out.println(res[0] + " " + res[1]);
        }
    }

    public static int[] query(LinkedHashMap<Integer, ArrayList<Integer>> map, int[] delCompany) {

        for (int i = 0; i < delCompany.length; i++) {
            map.remove(delCompany[i]);
        }
        Iterator<Map.Entry<Integer, ArrayList<Integer>>> iterator = map.entrySet().iterator();
        Map.Entry<Integer, ArrayList<Integer>> tail = null;
        while (iterator.hasNext()) {
            tail = iterator.next();
        }
        if (tail == null) {
            return new int[] {0, 0};
        } else {
            int company = tail.getKey();
            int price = tail.getValue().get(tail.getValue().size() - 1);
            return new int[] {company, price};
        }


    }
}
