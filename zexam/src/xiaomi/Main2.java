package xiaomi;

import java.util.*;
//4
//0 0 2 4
//0 2 2 2
//0 4 2 2
//8 8 2 2
public class Main2 {
    /*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
******************************开始写代码******************************/
    static void solution(String[] input) {
        for (int i = 0; i < input.length; i++) {
            String line = input[i].replaceAll(" ", "");
            String res = leftShift(line);
            System.out.println(res);
        }

    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        int _input_size = 0;
        _input_size = Integer.parseInt(in.nextLine().trim());
        String[] _input = new String[_input_size];
        String _input_item;
        for(int _input_i = 0; _input_i < _input_size; _input_i++) {
            try {
                _input_item = in.nextLine();
            } catch (Exception e) {
                _input_item = null;
            }
            _input[_input_i] = _input_item;
        }

        solution(_input);
    }

    public static String leftShift(String s) {
        StringBuilder sb = new StringBuilder();
        int m = s.length();
        while (s.startsWith("0")) {
            s = s.substring(1, s.length());
        }
        int comsenput = m - s.length();
        for (int i = 0; i < s.length(); i+= 2) {
             if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) != '0') {
                 int sum = (s.charAt(i) - '0') * 2;
                 sb.append(sum);
                 comsenput++;

             } else {
                 sb.append(s.charAt(i) + " ");
                 sb.append(s.charAt(i + 1)+ " ");
             }
        }
        for (int i = 0; i < comsenput; i++) {
            sb.append("0" + " ");
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}
