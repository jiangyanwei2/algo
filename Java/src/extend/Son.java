package extend;

public class Son extends Father {
    private String name = "son";
    public void callName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Father f = new Son();
    }
}
