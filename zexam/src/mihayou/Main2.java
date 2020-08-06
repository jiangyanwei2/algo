package mihayou;
import java.util.*;

import mihayou.Main1.Square;
public class Main2 {
	
class Square{
		
		public void setA(int a) {
			this.a = a;
		}
		public  int x = 0;
		private  int y = 0;
		private  int a = 0;
		public Square() {
			
		}
//		public Square(int x, int y, int a) {
//			this.x = x;
//			this.y = y;
//			this.a = a;
//		}
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
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		Square[] poison = new Square[3];
		System.out.println(poison[0].x);
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < 3; j++) {
//			System.out.println(sc.nextInt());
//			}
//			poison[i].x = sc.nextInt();
//			poison[i].y = sc.nextInt();
//			poison[i].a = sc.nextInt();
//		}
		
	}

}
