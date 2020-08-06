
public class IsScientificNumber {
	public static boolean isNumber(String str) {
		String regex = "[+-]?[0-9]*(\\.[0-9]+)?([Ee][+-]?[0-9]+)?";
		return str.matches(regex);
		
	}
	public static void main(String[] args) {
		String str = "cvte";
		
		if (str == "cvte") {
			System.out.println("1");
		}else {
			System.out.println("2");
		}
		
		
	}

}
