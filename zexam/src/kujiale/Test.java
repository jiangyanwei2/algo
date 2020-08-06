package kujiale;

public class Test {
    private static Test instance = new Test();
    private static int count1;
    private static int count2 = 0;

    private Test() {
        count1++;
        count2++;
    }

    public static Test getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Test.getInstance();
        System.out.println(Test.count1 + " " + Test.count2);
    }
}
