package leihuo;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(m());

    }
    public static int m() {
        int i = 0;
        try{
            i++;
            return i;
        }catch (Exception e) {

        }finally {
            i++;
        }
        return 100;
    }
}
