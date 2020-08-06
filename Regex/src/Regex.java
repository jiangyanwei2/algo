
public class Regex {
	
	
	
	
	public static void main(String[] args) {
		String s1 = "ABc";
		System.out.println(isAllUpCase(s1));
	}
	
	public static boolean isQQ(String qq) {
		//长度为5-10位，纯数字组成，且不能以0开头
		String regex = "[1-9][0-9]{4,9}";
		boolean b = qq.matches(regex);
		return b;
	}
	
	public static boolean isPhone(String phone) {
		//长度为5-10位，纯数字组成，且不能以0开头
		String regex = "1[378][0-9]{9}";
		boolean b = phone.matches(regex);
		return b;
	}
	
    public static boolean isAllUpCase(String word){
        return word.matches(".*([A-Z]+).*");
    }

}
