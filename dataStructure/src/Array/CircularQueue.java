package Array;

public class CircularQueue {
    private int front;
    private int rear;
    private int[] queue;
    public  CircularQueue(int size) {
        front = 0;
        rear = 0;
        queue = new int[size];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % queue.length == front;
    }

    public void offer(int data) {
        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % queue.length;
        }
    }

    public int poll() {
        if (!isEmpty()) {
            int res = queue[front];
            front = (front + 1) %queue.length;
            return res;
        }
        return 0;
    }
}
