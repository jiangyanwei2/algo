package xiecheng;

import java.util.Scanner;

public class Main5 {
	/*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
	static int BestMatch(int[] LimitArray, int[][] DegMatrix) {
		int N = LimitArray.length;
		int M = DegMatrix.length;
		return place(LimitArray, DegMatrix, 0, M, N);
	}

	static int place(int[] LimitArray, int[][] DegMatrix, int index, int M, int N) {
		int max = 0;
		int sum = 0;

		if (index == M)//处理最后一个员工
		{
			for (int i=1; i<=N; i++)
			{
				if (LimitArray[i] > 0)//如果该位置还可以容纳此员工，用sum记录其在该处的喜好度
					sum = DegMatrix[index][i];
				if (sum > max)
					max = sum;//用max记录该员工可以获得的最大喜好度
			}
		}
		else //如果处理的不是最后一个员工，应采用回溯方法以取得最优解
		{
			for (int i=1; i<=N; i++)
			{
				if (LimitArray[i] > 0)//如果该位置还可以容纳此员工，用sum记录其在该处的喜好度
				{
					LimitArray[i]--;//该位置可容纳员工数减1
					sum = DegMatrix[index][i] + place(LimitArray, DegMatrix, index+1, M, N);
					LimitArray[i]++;
				}
				if (sum > max)
					max = sum;
			}
		}
		return max; //返回第man到M个员工总的最大喜好度
	}
	/******************************结束写代码******************************/


	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int res;

		int _LimitArray_size = 0;
		int _DegMatrix_rows = 0;
		int _DegMatrix_cols = 0;
		_DegMatrix_rows = Integer.parseInt(in.nextLine().trim());
		_DegMatrix_cols = Integer.parseInt(in.nextLine().trim());
		_LimitArray_size = _DegMatrix_cols;

		int[] _LimitArray = new int[_LimitArray_size];
		int _LimitArray_item;
		for(int _LimitArray_i = 0; _LimitArray_i < _LimitArray_size; _LimitArray_i++) {
			_LimitArray_item = Integer.parseInt(in.nextLine().trim());
			_LimitArray[_LimitArray_i] = _LimitArray_item;
		}

		int[][] _DegMatrix = new int[_DegMatrix_rows][_DegMatrix_cols];
		for(int _DegMatrix_i=0; _DegMatrix_i<_DegMatrix_rows; _DegMatrix_i++) {
			for(int _DegMatrix_j=0; _DegMatrix_j<_DegMatrix_cols; _DegMatrix_j++) {
				_DegMatrix[_DegMatrix_i][_DegMatrix_j] = in.nextInt();

			}
		}

		if(in.hasNextLine()) {
			in.nextLine();
		}

		res = BestMatch(_LimitArray, _DegMatrix);
		System.out.println(res);
	}
}
