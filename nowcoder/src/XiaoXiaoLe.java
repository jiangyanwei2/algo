import java.util.LinkedList;

public class XiaoXiaoLe {

    public static void main(String[] args) {
        String[] arr = {"red","red","yellow","yellow","green","green","green","green","yellow","blue"};
        LinkedList<String> stack = new LinkedList<>();
        for(int i = 0; i < arr.length; i ++) {
            String cur = arr[i];
            String last = i < arr.length - 1 ? arr[i + 1] : "";
            if(stack.isEmpty() || !stack.peekLast().equals(cur) || cur.equals(last)) {
                stack.add(cur);
            } else {
                String t1 = !stack.isEmpty() ? stack.peekLast() : "";
                String t2 = stack.size() > 1 ? stack.get(stack.size() - 2) : "";
                if(cur.equals(t1) && cur.equals(t2)) {
                    while(!stack.isEmpty() && stack.peekLast().equals(cur)) {
                        stack.pollLast();
                    }
                } else {
                    stack.add(cur);
                }
            }
        }

        for(String color : stack) {
            System.out.println(color);
        }
    }
}
