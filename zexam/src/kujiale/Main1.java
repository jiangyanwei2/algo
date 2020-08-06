package kujiale;

import java.util.*;
//4
//4
//0 1 1
//0 2 3
//1 3 2
//2 3 1
//0
//3
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int res = 0;
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] edges = new int[N][N];
            for (int i = 0; i < M; i++) {
                int A = sc.nextInt();
                int B = sc.nextInt();
                int X = sc.nextInt();
                edges[A][B] = X;
                edges[B][A] = X;
            }
            int S = sc.nextInt();
            int T = sc.nextInt();
            res = minPath(S, T, edges);
            if (res != Integer.MAX_VALUE) {
                System.out.println(res);
            } else {
                System.out.println(-1);
            }
        }

    }

    public static int minPath(int src, int end, int[][] edges) {
        int N = edges.length;
        int[] dist = new int[N];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        int[] visited = new int[N];
        for (int i = 0; i < N; i++) {
            int x = -1, min = Integer.MAX_VALUE;
            for (int j = 0; j < N; j++) {
                if (visited[j] == 0 && dist[j] < min) {
                    x = j;
                    min = dist[j];
                }
            }
            visited[x] = 1;
            for (int k = 0; k < N; k++) {
                if (edges[x][k] > 0) {
                    int temp = dist[x] + edges[x][k];
                    if (dist[k] > temp)
                        dist[k] = temp;
                }
            }
        }
        return dist[end];
    }
}
