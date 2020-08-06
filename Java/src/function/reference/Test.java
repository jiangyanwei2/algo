package function.reference;
class Value{
    public int i=15;
}
public class Test {
	public void second(Value v){
	   
	    v.i = 20;
	    v = new Value();
	    System.out.println(v.i);
	   }
	public static void main(String[] args) {
		Value v = new Value();
		Test t = new Test();
		t.second(v);
		System.out.println(v.i);
	}
}
