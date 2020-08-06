package beikepractice;

public class Practice {
    static int arr[] = new int[5];
    public final static native int m();
    public static void main(String[] args) {
        System.out.println(arr[0]);
        Float f = Float.parseFloat("1.0");
        System.out.println(f);

        int a = 40000;
        int b = 40000;
        long res = a * b;
        System.out.println(res);
    }
}
