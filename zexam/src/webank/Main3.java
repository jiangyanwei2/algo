package webank;

import java.util.Scanner;

public class Main3 {
	static String GetResult(int N) {
		if (N == 1) {
			return "1/1";
		}
		int i = 1;
		int row = 1;
		int col = 1;
		for (; i < N; i++) {
			if ((i *(i+1) < 2*N) && ((i + 1)*(i + 2) >= 2*N)) {
				 break;
			}
		}
		int diff = N- i*(i + 1)/2 - 1;
		if ((i + 1) % 2 == 0) {
			row = 1 + diff;
			col = i + 1 - diff;
		}else {
			row = i + 1 - diff;
			col = 1 + diff;
		}
		
		return row + "/" + col;


    }
	
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;
            
        int _N;
        _N = Integer.parseInt(in.nextLine().trim());
  
        res = GetResult(_N);
        System.out.println(res);
    }

}
