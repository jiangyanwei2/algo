package kuaishou;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String noUse = sc.nextLine();
        String[] input = new String[n];
        ArrayList<ArrayList<String>> tmp = new ArrayList<>();
        HashMap<String, Set<String>> map = new HashMap<>();
        HashMap<String, Boolean> visited = new HashMap<>();
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            String str = input[i].substring(7);
            int index = str.indexOf('/');
            String domain = "";
            String path = "";
            if (index == -1) {
                domain = str;
                path = " ";
            }else{
                domain = str.substring(0, index);
                path = str.substring(index);
            }
            visited.put(domain, false);
            if (!map.containsKey(domain)) {
                Set<String> set = new HashSet<>();
                set.add(path);
                map.put(domain, set);
            }else {
                map.get(domain).add(path);
            }
        }
        for(String key : visited.keySet()) {
            if (!visited.get(key)) {
                ArrayList<String> list = new ArrayList<>();
                list.add(key);
                for(String domain : map.keySet()) {
                    Set<String> set1 = map.get(key);
                    Set<String> set2 = map.get(domain);
                    if (key != domain && set1.size() == set2.size()
                            && set1.containsAll(set2) && set2.containsAll(set1)) {
                        list.add(domain);
                        visited.put(domain, true);
                    }
                }
                if (list.size() > 1) {
                    tmp.add(new ArrayList<>(list));
                }
            }
        }
        printResult(tmp);

    }

    public static void printResult(ArrayList<ArrayList<String>> res) {
        System.out.println(res.size());
        for(ArrayList<String> list : res){
            printList(list);
        }
    }

    public static void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print("http://" + list.get(i));
                System.out.println();
            } else {
                System.out.print("http://" + list.get(i) + " ");
            }
        }
    }
}
