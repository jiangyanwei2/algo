package huawei;

import java.util.*;

public class Main2 {
	private static Map<String, Integer> map = new HashMap<>();
	private static boolean[] notVaild = new boolean[1];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String enter = sc.nextLine();

		String[] program = new String[n];
		for (int i = 0; i < n; i++) {
			program[i] = sc.nextLine().replaceAll(" ", "");
		}
		for (int i = 0; i < n - 1; i++) {
			String line = program[i];
			String[] strArr = line.split("=");
			String left = strArr[0];
			String expr = strArr[1];
            notVaild[0] = false;
			int val = calExpr(expr);
			map.put(left, val);
		}
		String tailLine = program[n - 1];
		String[] strArr = tailLine.split("=");
		String tailLeft = strArr[0];
		String tailExpr = strArr[1];
		int val = calExpr(tailExpr);
		map.put(tailLeft,val);
		if (notVaild[0]) {
			System.out.println("NA");
		} else {
			System.out.println(map.get(tailLeft));
		}

		
	}

	public static int calExpr(String str) {
		String[] unit = str.split("\\+");
		int res = 0;
		for (int i = 0; i < unit.length; i++) {
			if (isNum(unit[i])) {
				res += Integer.valueOf(unit[i]);
			} else {
				if (!map.containsKey(unit[i])) {
					notVaild[0] = true;
				} else {
					res += map.get(unit[i]);
				}
			}
		}
		return res;
	}

	public static boolean isNum(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}



}
