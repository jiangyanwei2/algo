import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
	public static void main(String[] args) {
		Integer[] help = {1,2,3,4,5,6};
		List<Integer> list = Arrays.asList(help);
		System.out.println(list);//[1, 2, 3, 4, 5, 6]
		help[1] = 5;
		System.out.println(list);//[1, 5, 3, 4, 5, 6]
	}
}
