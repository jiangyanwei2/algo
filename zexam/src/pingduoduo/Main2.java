package pingduoduo;

import java.util.*;

public class Main2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sa = s.split("");
        boolean res = dfs(sa,new ArrayList<String>());
        System.out.println(res);
    }
	
	
	public static boolean dfs(String[] sa, ArrayList<String> list) {
		if (list.size() == sa.length) {
			for (int i = 0; i < sa.length; i++) {
				if (sa[i].charAt(sa[i].length() - 1) != sa[i + 1].charAt(0)) {
					return false;
				}
			}
			return true;
		} else {
			for (int i = 0; i < sa.length; i++) {
				if (list.contains(sa[i])) continue;
				list.add(sa[i]);
				dfs(sa, list);
				list.remove(list.size() - 1);
			}
		}
		return true;
	}
}
