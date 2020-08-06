package dajiang;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int res = 0;
            int N = sc.nextInt();
            int P = sc.nextInt();
            int C = sc.nextInt();
            int[][] edges = new int[N][N];
            for (int i = 0; i < P; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int time = sc.nextInt();
                edges[a][b] = time;
                edges[b][a] = time;
            }
            int src = 0;
            for (int i = 0; i < C; i++) {
                int end = sc.nextInt();
                res += minPath(src,end,N,edges);
                src = end;
            }
            System.out.println(res);
        }

    }

    public static int minPath(int src, int end, int N, int[][] edges) {
        int[] dist=new int[N];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src]=0;
        int[] visited=new int[N];
        for(int i = 0; i< N; i++){
            int x=-1,min=Integer.MAX_VALUE;
            for(int j = 0; j < N; j++){
                if(visited[j] == 0 && dist[j] < min){
                    x = j;
                    min = dist[j];
                }
            }
            visited[x]=1;
            for(int k=0; k<N; k++){		//更新dist值，松弛操作
                if(edges[x][k] > 0){
                    int temp=  dist[x]+edges[x][k];
                    if(dist[k] > temp)
                        dist[k] = temp;
                }
            }
        }
        return dist[end];
    }
}
