import java.util.Scanner;

public class Split {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
        
            String path = sc.next();
            int num = sc.nextInt();
            String[] arr = path.split("\\\\");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]); 
        }
    }
}
