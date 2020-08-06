package meituan;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main1 {
//    private static AtomicInteger times = new AtomicInteger();
//    private static final int N = 5;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        times.set(1);
//        Thread bonus = new Thread(new PrintA(times, n));
//        Thread coupon = new Thread(new PrintB(times, n));
//        Thread contribution = new Thread(new PrintC(times, n));
//        bonus.start();
//        coupon.start();
//        contribution.start();
//    }
//
//    static class PrintA implements Runnable{
//        private static AtomicInteger time;
//        private int n;
//
//        public PrintA(AtomicInteger time, int n) {
//            this.time = time;
//            this.n = n;
//        }
//
//        @Override
//        public void run() {
//            while (time.get() <= n) {
//                if (time.get() % 2 == 1) {
//                    System.out.print("A");
//                    time.getAndIncrement();
//                }
//            }
//        }
//    }
//
//    static class PrintB implements Runnable{
//        private static AtomicInteger time;
//        private int n;
//
//        public PrintB(AtomicInteger time, int n) {
//            this.time = time;
//            this.n = n;
//        }
//
//        @Override
//        public void run() {
//            while (time.get() <= n) {
//                if (time.get() % 2 == 0 && (time.get() / 2 ) % 2 == 1 ) {
//                    System.out.print("B");
//                    time.getAndIncrement();
//                }
//            }
//        }
//    }
//
//    static class PrintC implements Runnable{
//        private static AtomicInteger time;
//        private int n;
//
//        public PrintC(AtomicInteger time, int n) {
//            this.time = time;
//            this.n = n;
//        }
//
//        @Override
//        public void run() {
//            while (time.get() <= n) {
//                if (time.get() % 2 == 0 && (time.get() / 2 ) % 2 == 0 ) {
//                    System.out.print("C");
//                    time.getAndIncrement();
//                }
//            }
//        }
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        StringBuilder sb =new StringBuilder();
        while (i <= n) {
            if (i % 2 == 1) {
                sb.append("A");
            } else if (i % 2 == 0 && (i / 2 ) % 2 == 1) {
                sb.append("B");
            } else if (i % 2 == 0 && (i / 2 ) % 2 == 0) {
                sb.append("C");
            }
            i++;
        }
    System.out.println(sb.toString());
}


}
