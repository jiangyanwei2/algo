import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Parentheses {
	public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }
    
    public static void backtrack(List<String> list, String str, int open, int close, int max){
        
        if(str.length() == max*2){
            list.add(str);
            return;
        }
        
        if(open < max)
            backtrack(list, str+"(", open+1, close, max);
        if(close < open)
            backtrack(list, str+")", open, close+1, max);
    }
    public static void printList(List list) {
    	Iterator it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.print(obj + " ");
		}
		System.out.println("");
    }
    public static void main(String[] args) {
    	List<String> list = generateParenthesis(3);
    	printList(list);
	}
}
