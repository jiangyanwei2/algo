package Java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Distinct {
	public static void main(String[] args) {
		int[] arr = {1,1,2,3,4,1};
		Supplier supplier;
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
	}

}
