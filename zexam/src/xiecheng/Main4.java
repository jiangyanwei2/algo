package xiecheng;

import java.util.Scanner;

public class Main4 {

	/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
******************************开始写代码******************************/
	static boolean CheckBlackList(String userIP, String blackIP) {
		String[] strArr = blackIP.split("/");
		if (strArr.length == 1) {
			return blackIP.equals(userIP);
		} else {
			int maskCount = Integer.valueOf(strArr[1]);
			String[] blackIPArr = strArr[0].split("\\.");
			String[] userIPArr = userIP.split("\\.");
			int index = maskCount / 8;
			int bit = maskCount % 8;
			if (bit == 0) {
				for (int i = 0; i < index; i++) {
					if (!userIPArr[i].equals(blackIPArr[i])) {
						return false;
					}
				}
				return true;
			} else {
				for (int i = 0; i < index; i++) {
					if (!userIPArr[i].equals(blackIPArr[i])) {
						return false;
					}
				}
				Integer xor = Integer.valueOf(userIPArr[index])  ^ Integer.valueOf(userIPArr[index]);
				int diff = 8 - bit;
				if (xor >>> diff == 0) {
					return true;
				} else {
					return false;
				}
			}
		}

	}


	/******************************结束写代码******************************/


	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		boolean res;

		String _userIP;
		try {
			_userIP = in.nextLine();
		} catch (Exception e) {
			_userIP = null;
		}

		String _blackIP;
		try {
			_blackIP = in.nextLine();
		} catch (Exception e) {
			_blackIP = null;
		}

		res = CheckBlackList(_userIP, _blackIP);
		System.out.println(String.valueOf(res ? 1 : 0));
	}

}
