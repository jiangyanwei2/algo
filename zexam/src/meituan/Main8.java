package meituan;

import java.util.*;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        HashMap<Integer, ArrayList<Integer>> xmap = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> ymap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!xmap.containsKey(arr[i][0])) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[i][1]);
                xmap.put(arr[i][0], list);
            } else {
                xmap.get(arr[i][0]).add(arr[i][1]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (!ymap.containsKey(arr[i][1])) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[i][0]);
                ymap.put(arr[i][1], list);
            } else {
                ymap.get(arr[i][1]).add(arr[i][0]);
            }
        }
        for (Integer key : xmap.keySet()) {
            ArrayList<Integer> list = xmap.get(key);
            Collections.sort(list);
        }
        for (Integer key : ymap.keySet()) {
            ArrayList<Integer> list = ymap.get(key);
            Collections.sort(list);
        }
        for (Integer key : xmap.keySet()) {
            ArrayList<Integer> xlist = xmap.get(key);
            if (xlist.size() > 2) {
                for(int i = 1; i < xlist.size() - 1; i++) {
                    int e = xlist.get(i);
                    ArrayList<Integer> ylist = ymap.get(e);
                    if(ylist.indexOf(key) != 0 && ylist.indexOf(key) != ylist.size() - 1) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
