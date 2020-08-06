package xiaohongshu;

import java.util.*;

public class Main3 {
    static class Box {

        private int x;
        private int h;

        public Box(int x, int h) {
            this.x = x;
            this.h = h;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Box[] arr = new Box[n];
        int res = 0;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Box(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(arr, new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                if (o1.x == o2.x) {
                    if (o1.h > o2.h) {
                        return 1;
                    } else if (o1.h == o2.h) {
                        return 0;
                    } else {
                        return -1;
                    }
                } else if (o1.x > o2.x) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for (int i = 0; i < arr.length - 1; i++) {
            if (isGreat(arr[i + 1], arr[i])) {
                res++;
            }
        }
        System.out.println(res);
    }

    public static boolean isGreat(Box box1, Box box2) {
        if (box1.x >= box2.x && box1.h >= box2.h) {
            return true;
        } else {
            return false;
        }
    }

}
