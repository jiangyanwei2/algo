package TopK;

import java.util.PriorityQueue;

public class HeapTopK {
    public static int findTopK(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (heap.size() < k) {
                heap.offer(arr[i]);
            }
            else if (arr[i] > heap.peek()) {
                heap.poll();
                heap.offer(arr[i]);
            }
        }
        return heap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        System.out.println(findTopK(arr, 2));
    }
}
