package leihuo;

import java.util.concurrent.*;

public class Main1 {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(10);
        Task task = new Task();
        FutureTask<Integer> futureTask = new FutureTask<>(task);
        executor.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    static class Task implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            return null;
        }
    }
}
