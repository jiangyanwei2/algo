package huawei;

import java.util.*;

public class Main3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new TreeSet<>();
        Stack<Character> stack = new Stack<>();
		String line = null;
		String json = null;
        int zhonghuohao = 0;
		int dakuohao = 0;
        int yinhao = 0;
        String res = "";
		while (!"".equals(line)) {
		    line = sc.nextLine().replaceAll(" ", "");
		    json += line;
        }
        for (char c : json.toCharArray()) {
            if (c == '"') {
                yinhao++;
            }
            else if (c == '[' || c == ']') {
                zhonghuohao++;
            }
            else if (c == '{' || c == '}') {
                dakuohao++;
            }
        }
        if (zhonghuohao % 2 == 1) {
		    set.add(1);
        }
        if (dakuohao % 2 == 1) {
            set.add(2);
        }
        if (yinhao % 2 == 1) {
            set.add(3);
        }

		for(Integer e :set) {
		    res += e;
        }

        if (set.isEmpty()){
            System.out.println(0);
        } else {
            System.out.println(res);
        }
	}

}
