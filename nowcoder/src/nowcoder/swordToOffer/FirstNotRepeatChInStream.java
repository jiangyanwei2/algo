package nowcoder.swordToOffer;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNotRepeatChInStream {

	
	
	public static void main(String[] args) {
		Map<Character,Integer> map = new LinkedHashMap<>();
		map.put('c',2);
		map.put('a',1);
		
		for (Map.Entry<Character,Integer> entry: map.entrySet()){
			System.out.println(entry);
		}
	}

}
