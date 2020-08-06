package baidu;

import java.util.*;
//3
//1 0 3
public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] arr = new Long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long k = getK(arr);
        System.out.println(k);
    }

    public static long getK(Long[] arr) {
        long k = 0L;
        int n = arr.length;
        PriorityQueue<Long> maxHeap = new PriorityQueue<>(new Comparator<Long>(){
            @Override
            public int compare(Long o1, Long o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < n; i++) {
            maxHeap.offer(arr[i]);
        }
        long max = maxHeap.poll();
         while (max >= n) {
            long tmp = max / n;
            k += tmp;
            ArrayList<Long> list = new ArrayList<>();
            while(maxHeap.size() > 0) {
                long e = maxHeap.poll();
                e += tmp;
                list.add(e);
            }
            maxHeap.addAll(list);
            maxHeap.offer(max % n);
            max = maxHeap.poll();
        }
        return k;
    }
}
