package alibaba;

import java.util.Scanner;
//1
//5
//S###.
//...#.
//E#.##
//.#..#
//.####
public class Main1 {
    public static char[][] tou = {
            {'0','0','0','0','0'},
            {'1','0', '0', '0',},
            {'6','4', '3', '5', '2'}
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            char[][] map = new char[n][n];
            char[][] res = new char[n][n];
            String noUse = sc.nextLine();
            for (int j = 0; j < n; j++) {
                String line = sc.nextLine();
                char[] ch = line.toCharArray();
                for (int k = 0; k < n; k++) {
                    map[j][k] = ch[k];
                }
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (map[j][k] == '.') {
                        res[j][k] = '.';
                    }
                }
            }
            int ox = 0;
            int oy = 0;
            for (; ox < n; ox++) {
                for (; oy < n; oy++) {
                    if(map[ox][oy] == 'S') {
                        break;
                    }
                }
            }
            char num = '6';
            char newNum = ' ';
            int x = ox;
            int y = oy;
            while (map[x][y] != 'E') {
                res[x][y] = num;
                if (map[x][y - 1] == '#') {
                    newNum = tou[num][1];
                    y = y - 1;
                } else if (map[x][y + 1] == '#') {
                    newNum = tou[num][2];
                    y = y + 1;
                } else if (map[x - 1][y] == '#') {
                     newNum = tou[num][3];
                     x =x - 1;
                } else if (map[x + 1][y] == '#') {
                    newNum = tou[num][4];
                    x =x + 1;
                }
                num = newNum;
            }
            res[x][y] = num;
        }
    }

    public void printRes(char[][] res) {
        int n = res.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n -1) {
                    System.out.print(res[i][j]);
                    System.out.println();
                } else {
                    System.out.print(res[i][j]);
                }
            }
        }
    }
}
