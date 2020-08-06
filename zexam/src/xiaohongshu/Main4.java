package xiaohongshu;

import java.util.*;

public class Main4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.next();
        int firstIndex=str.indexOf('(');
        if (firstIndex!=-1){
            int lastIndex=str.lastIndexOf(')');
            int len=str.length();
            str=str.substring(0,firstIndex)+str.substring(lastIndex+1,len);
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='<'){
                if (i==0 || (i>0 && str.charAt(i-1)=='<') || sb.length() == 0){
                    continue;
                }else{
                    sb.deleteCharAt(sb.length() - 1);
                }
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }


}

