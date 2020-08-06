package amazon;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        List<int[]> list = new ArrayList<>();

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int start = arr[0][0];
        int end = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] < end) {
                end = Math.max(end, arr[i][1]);
            } else {
                list.add(new int[] {start, end});
                start = arr[i][0];
                end = arr[i][1];
            }
        }
        list.add(new int[] {arr[arr.length - 1][0], arr[arr.length - 1][1]});
        int[][] res = list.toArray(new int[list.size()][]);
        for(int[] line : res) {
            System.out.println(line[0] + "," + line[1]);
        }
    }
}
