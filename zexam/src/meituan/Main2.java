package meituan;

import java.util.*;
//壹、贰、叁、肆、伍、陆、柒、捌、玖、拾、佰、仟、万、亿、元、角、分、零、整；
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    }

    public static String intToChinese(int num) {
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "壹拾", "贰拾", "叁拾", "肆拾", "伍拾", "陆拾", "柒拾", "捌拾", "玖拾"};
        String I[] = {"", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return M[num/1000] + C[num/100%10] + X[num/10%10] + I[num%10];
    }
}
