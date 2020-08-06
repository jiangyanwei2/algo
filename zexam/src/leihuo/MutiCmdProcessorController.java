package leihuo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.*;

public class MutiCmdProcessorController extends CmdProcessorController {
    ExecutorService executor= Executors.newFixedThreadPool(10);

    class RunCmdTask implements Callable<String> {
        private String cmd;

        public RunCmdTask(String cmd) {
            this.cmd = cmd;
        }

        @Override
        public String call() {
            try {
                Process process = Runtime.getRuntime().exec(cmd);
                InputStream is = process.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                StringBuilder sb = new StringBuilder();
                String s = null;
                while ((s = reader.readLine()) != null) {
                    sb.append(s);
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    @Override
    public String process(String cmd)  {
        RunCmdTask runCmdTask = new RunCmdTask(cmd);
        Future<String> res = executor.submit(runCmdTask);
        try {
            String output =  res.get();
            return output;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class.forName("").newInstance();
    }

}
