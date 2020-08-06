package pingduoduo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int s = sc.nextInt(); //进行的次数
            for (int  i = 1;  i<=s ; ++i) {
                String mei = sc.next();
                String bai = sc.next();
                List<String> res = new ArrayList<>();
                List<String> list = dfs(mei,bai,"",0,res,"");
                Collections.sort(list);
                System.out.println("{");
                for(String ls: list){
                    for (int j = 0; j <ls.length() ; j++) {
                        if(j!=ls.length()-1) System.out.print(ls.charAt(j)+" ");
                        else {
                            System.out.print(ls.charAt(j));
                        }
                    }
                    System.out.println();
                }

                System.out.println("}");
            }
        }
    }

    public static List<String> dfs(String mei, String bai, String newStr, int i, List<String> res, String way){
        if(bai.equals(newStr)){
            res.add(way);
            //return res;
        }
        if(i==mei.length()) return res;

        way+="d";
        dfs(mei,bai,newStr,i+1,res,way);
        way = way.substring(0,way.length()-1);

        String tmp1 = newStr;
        newStr = mei.substring(i,i+1) + newStr;
        way+="l";
        dfs(mei,bai,newStr,i+1,res,way);
        way = way.substring(0,way.length()-1);
        newStr = tmp1;

        String tmp2 = newStr;
        newStr = newStr + mei.substring(i,i+1);
        way+="r";
        dfs(mei,bai,newStr,i+1,res,way);
        way = way.substring(0,way.length()-1);
        newStr = tmp2;

        return res;
    }
}
