package num;

import java.util.Date;

public class Test extends Date {
	private void fun() {
		System.out.println(super.getClass().getName());
	}
	public static void main(String[] args) {
		new Test().fun();
	}

}
