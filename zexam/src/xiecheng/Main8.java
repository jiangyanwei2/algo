package xiecheng;

import java.util.*;

public class Main8 {
    private static HashMap<String, LinkedList<String>> graph = new HashMap<>();
    /*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
******************************开始写代码******************************/
    static List<List<String>>answer(String inputStr) {
//返回的结果中，最外层的List的元素表示每个飞行方案，最里层List元素表示单个飞行方案经过的每个城市
        List<List<String>> res = new ArrayList<>();
        createGraph(inputStr);
        if (graph.containsKey("A")) {
            LinkedList<String> zero = graph.get("A");
            if (zero.contains("B")) {
                LinkedList<String> list = new LinkedList<>();
                list.add("A");
                list.add("B");
                res.add(new LinkedList<>(list));
            }
            for (String key1 : zero) {
                if (graph.containsKey(key1)) {
                    LinkedList<String> one = graph.get(key1);
                if (one.contains("B")) {
                    LinkedList<String> list = new LinkedList<>();
                    list.add("A");
                    list.add(key1);
                    list.add("B");
                    res.add(new LinkedList<>(list));
                }
                for (String key2 : one) {
                    if (graph.containsKey(key2)) {
                        LinkedList<String> two = graph.get(key2);
                        if (two.contains("B")) {
                            LinkedList<String> list = new LinkedList<>();
                            list.add("A");
                            list.add(key1);
                            list.add(key2);
                            list.add("B");
                            res.add(new LinkedList<>(list));
                        }
                        for (String key3 : two) {
                            if (graph.containsKey(key3)) {
                                LinkedList<String> three = graph.get(key3);
                                if (three.contains("B")) {
                                    LinkedList<String> list = new LinkedList<>();
                                    list.add("A");
                                    list.add(key1);
                                    list.add(key2);
                                    list.add(key3);
                                    list.add("B");
                                    res.add(new LinkedList<>(list));
                                }
                            }

                        }
                    }
                }
            }
        }
        }
        return res;
    }
    /******************************结束写代码******************************/
   static void createGraph(String str) {
       String[] points = str.split(";");
       for (int i = 0; i < points.length; i++) {
           String p = points[i];
           String comb = p.substring(1, p.length() - 1);
           String[] ca = comb.split(",");
           String from = ca[0];
           String to = ca[1];
           if (!graph.containsKey(from)) {
               LinkedList<String> list = new LinkedList<>();
               list.add(to);
               graph.put(from, list);
           } else {
               graph.get(from).add(to);
           }
       }
       for (String key : graph.keySet()) {
           Collections.sort(graph.get(key));
       }
   }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String inputStr = cin.nextLine().trim();
        List<List<String>> result = answer(inputStr);
        if (result != null && result.size() > 0) {
            System.out.print("[");
            for (int i = 0; i < result.size(); i++) {
                if (i == result.size() - 1) {
                    printPath(result.get(i));
                } else {
                    printPath(result.get(i));
                    System.out.print(",");
                }
            }
            System.out.print("]");
            System.out.println();
        } else {
            System.out.println("EMPTY");
        }
    }

    public static void printPath(List<String> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.print("]");
    }
}
