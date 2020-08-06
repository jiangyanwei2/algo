package tufu;

import java.util.HashSet;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        String str="QQQWWWEERRRR";
        int N=str.length();
        while(N>0){
            int dis=str.length()-N+1;
            for(int i=0;i<N;i++){
                String ss=str.substring(i,i+dis);
                set.add(ss);
            }
            N--;
        }
        System.out.println(set.size());
    }
}
