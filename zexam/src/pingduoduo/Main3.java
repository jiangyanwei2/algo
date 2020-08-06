package pingduoduo;

import java.util.*;

//第一行包含2个正整数N、M，分别表示任务数量以及M个任务依赖关系。
//
//第二行包含N个正整数，第i（1 <= i <= N）个数表示第i个任务的处理时间Pi。
//
//接下来的M行，每行表示一个任务依赖关系。每行包含2个整数Ai（1 <= Ai <= N）、Bi（1 <= Bi <= N）。表示第Bi个任务依赖于第Ai个任务。数据保证不会出现循环依赖的情况。
//5 6
//
//1 2 1 1 1
//
//1 2
//
//1 3
//
//1 4
//
//2 5
//
//3 5
//
//4 5
public class Main3 {
    static class Task{
        private int seq;
        private int time;

        public Task(int seq, int time) {
            this.seq = seq;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Task[] task = new Task[n + 1];
        for (int i = 1; i <= n ; i++) {
            task[i] = new Task(i, sc.nextInt());
        }
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int[] indegree = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            if (graph.containsKey(u)) {
                graph.get(u).add(v);
            } else {
                List<Integer> edges = new ArrayList<>();
                edges.add(v);
                graph.put(u,edges);
            }
            indegree[v]++;
        }

        PriorityQueue<Task> queue = new PriorityQueue<>(new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.time - o2.time;
            }
        });

        for (int i = 1; i <= n; i++) {
            if (indegree[i] == 0) {
                queue.offer(task[i]);
            }
        }

        List<Integer> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            Task complete = queue.poll();
            res.add(complete.seq);
            if (graph.containsKey(complete.seq)) {
                for(Integer edge : graph.get(complete.seq)) {
                    if (--indegree[edge] == 0) {
                        queue.offer(task[edge]);
                    }
                }
            }
        }
        printList(res);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
                System.out.println();
            } else {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}
