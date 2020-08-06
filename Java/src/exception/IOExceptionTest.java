package exception;

import java.io.IOException;

public class IOExceptionTest {
    public static void main(String[] args) {
        try{
            int i = 100;
            System.out.print(i);
            throw new IOException();

        }catch(IOE1 ioe1){
            System.out.print("IOE1");
        }catch(IOException io){
            System.out.print("IOException");
        }catch (Exception e) {
            System.out.println();
        }
        finally{
            System.out.print(2);
        }
        System.out.print(3);
    }

}
