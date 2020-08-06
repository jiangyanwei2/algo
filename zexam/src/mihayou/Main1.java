package mihayou;
import java.util.*;
public class Main1 {
	
static class Square{
		
		public void setA(int a) {
			this.a = a;
		}
		private  int x;
		private  int y;
		private  int a;
		public Square() {
			
		}
		public Square(int x, int y, int a) {
			this.x = x;
			this.y = y;
			this.a = a;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public int getA() {
			return a;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Square[] poison = new Square[n];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			poison[i] = new Square(x, y, a);
		}
			
		System.out.println(areaSum(poison));
	}
	
	private static long areaSum(Square[] poison) {
		long res = 0;
		Arrays.sort(poison, comparatorX);
		int i = 0;
		for (; i < poison.length - 1; i++) {
			if ((poison[i + 1].x > poison[i].x) && (poison[i + 1].x < poison[i].x + poison[i].a)
				&&(poison[i + 1].y > poison[i].y) && (poison[i + 1].y < poison[i].y + poison[i].a)) {
				res += poison[i].a * poison[i].a - (poison[i].x + poison[i].a - poison[i + 1].x)*(poison[i].y + poison[i].a - poison[i + 1].y);
			}else {
				res += poison[i].a * poison[i].a;
			}
		}
		res += poison[i].a * poison[i].a;
		return res;
	}
	
	private final static Comparator<Square> comparatorX = new Comparator<Square>(){
		@Override
		public int compare(Square s1, Square s2) {
			int x = s1.x - s2.x;
			int y = s1.y - s2.y;
			int a = s1.a - s2.a;
			if(x==0){
			     if(y==0){
			            return a;
			     }
			     return y;
			}
			return x;
		}		
	};
	
	
}
