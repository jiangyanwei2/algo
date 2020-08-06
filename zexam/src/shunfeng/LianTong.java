package shunfeng;

public class LianTong {

    public static int countGroup(int[][] arr) {
        boolean[] visited = new boolean[arr.length];
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                res++;
                dfs(i, arr, visited);
            }
        }
        return res;
    }
    
    public static void dfs (int i, int[][] arr, boolean[] visited) {
        visited[i] = true;
        for (int j = 0; j < arr.length; j++) {
            if (!visited[j] && arr[i][j] == 1) {
                dfs(j, arr, visited);
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,0}, {1,1,1}, {0,1,1}};
        System.out.println(countGroup(arr));
    }
}
