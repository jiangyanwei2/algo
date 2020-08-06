package chap3;

public class Test1 {
	private Object instance;
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		t1.instance = t2;
		t2.instance = t1;
		t1 = null;
		t2 = null;
		System.gc();
	}

}
