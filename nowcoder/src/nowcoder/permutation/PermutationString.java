package nowcoder.permutation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationString {
	public static ArrayList<ArrayList<Character>> Permutation(String str) {
		ArrayList<ArrayList<Character>> res = new ArrayList<>();
        if (str != null && str.length() > 0) {
            PermutationHelper(str.toCharArray(), new ArrayList<Character>(), res);
            //Collections.sort(res);
        }
        return res;
    }
 
    public static void PermutationHelper(char[] cs, ArrayList<Character> list, ArrayList<ArrayList<Character>> res) {
        if (list.size() == cs.length) {
            res.add(list);
        } else {
            for (int i = 0; i < cs.length; i++) {
            	if (list.contains(cs[i])) continue;
            	list.add(cs[i]);
            	PermutationHelper(cs, list, res);
            	list.remove(list.size() - 1);
            }
            
        }
    }
 
    public static void swap(char[] cs, int i, int j) {
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }
    
    public static void main(String[] args) {
		System.out.println(Permutation("abc"));
	}

}
