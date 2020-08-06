package trye;

public class Array {
	public static void main(String[] args) {
		System.out.println(array().length);
		StringBuilder sb = new StringBuilder();
		sb.append("john");
		sb.insert(0, 1);
		sb.insert(0, 2);
		System.out.println(sb.toString());
	}
	
	public static int[] array() {
		int[] arr = {1,2,3};
		return arr;
	}

}
