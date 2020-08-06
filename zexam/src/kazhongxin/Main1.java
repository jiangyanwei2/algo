package kazhongxin;

import java.util.*;
//5
//1 2 -3
//1 3 2
//2 4 6
//2 5 -3
//3 6 0 0 0
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        char[] input=str.toCharArray();
        int[] res=new int[input.length];
        for(int i=0;i<input.length;i++){
            if(input[i]=='R'){
                int index=findL(input,i);
                if((index-i)%2==0){
                    res[index]++;
                }else{
                    res[index-1]++;
                }
            }
            if(input[i]=='L'){
                int index=findR(input,i);
                if((index-i)%2==0){
                    res[index]++;
                }else{
                    res[index+1]++;
                }
            }
        }
        printArray(res);
    }
    public static int findL(char[] arr,int index){
        int i=index;
        for(i=index;i<arr.length;i++){
            if(arr[i]=='L'){
                break;
            }
        }
        return i;
    }
    public static int findR(char[] arr,int index){
        int i=index;
        for(i=index;i>=0;i--){
            if(arr[i]=='R'){
                break;
            }
        }
        return i;
    }

    public static void printArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
                System.out.println();
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}
