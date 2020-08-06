package exception;

public class E1 {
	 public int add(int a,int b){   
         try {
             return a+b;      
         } 
        catch (Exception e) {  
            System.out.println("catch execute");
         }
         finally{ 
             System.out.println("finally execute");
         }
         return 0;
    } 
     public static void main(String argv[]){ 
         E1 test =new E1(); 
         System.out.println("add:"+test.add(9, 34)); 
     }
}
