package webank;

public class Main2 {
	
	public static void printMatrixZigZag(int[][] matrix){
        // 都是从0,0 位置开始
        int row1 =1;
        int col1 = 1;
        int row2 = 1;
        int col2 = 1;
        int count = 0;
        // 记录行边界
        int endR = matrix.length-1;
        // 记录列边界
        int endC = matrix[0].length-1;
        // 判断打印方向
        boolean fromUp = false;
        // row1越界停止，或者col2越界停止
        while (row1 != endR+1) {
            printLevel(matrix, row1, col1, row2, col2, fromUp);
            
            row1 = col1 == endC ? row1 + 1: row1;
            col1 = col1 == endC ? col1 : col1+ 1;
            
            row2 = row2 == endR ? row2 : row2 + 1 ;
            col2 = row2 == endR ? col2 + 1 : col2;
            fromUp = !fromUp;
        }
        System.out.println();
    }


	
	 public static void printLevel(int[][] matrix, int row1, int col1, int row2,int col2, boolean fromUp){
	        if(fromUp) {
	            while (row1 <= row2){
	                System.out.print(matrix[row1++][col1--] + "");
	            }
	        } else {
	            while (row2 <= row1) {
	                System.out.print(matrix[row2--][col2++] + "");
	            }
	        }
	    }



}
