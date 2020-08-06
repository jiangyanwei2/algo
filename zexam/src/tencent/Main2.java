package tencent;

import java.util.*;

public class Main2 {
    static class Queue{
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void offer(int node) {
            stack1.push(node);
        }

        public int peek() {
            if(stack1.isEmpty() && stack2.isEmpty()) {
                throw new RuntimeException("The Queue is Empty!");
            }else if (stack2.isEmpty()) {
                while(!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.peek();
        }

        public int poll() {
            if(stack1.isEmpty() && stack2.isEmpty()) {
                throw new RuntimeException("The Queue is Empty!");
            }else if (stack2.isEmpty()) {
                while(!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String noUse = sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        operation(arr);
    }

    public static void operation(String[] arr) {
        // Queue queue = new Queue();
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            String[] strArr = arr[i].split(" ");
            if (strArr.length == 2) {
                int num = Integer.parseInt(strArr[1]);
                queue.offer(num);
            } else {
                if (arr[i].equals("peek")) {
                    if (!queue.isEmpty()) {
                        System.out.println(queue.peek());
                    }
                }
                if (arr[i].equals("poll")) {
                    if (!queue.isEmpty()) {
                        queue.poll();
                    }

                }
            }
        }
    }
}
