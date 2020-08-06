package time;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rep;
		int rw;
		int sw;
		String sstr = null;
		String rstr = null;
		Scanner in = new Scanner(System.in); 
		rep= in.nextInt();
		rw = rep/10;
		sw = rep%10;
	switch (rw)
	{
	case 1: sstr = "unreadable."; break;
	case 2: sstr = "barely readable, occasional words distinguishable."; break;
	case 3: sstr = "readable with considerable difficulty."; break;
	case 4: sstr = "readable with practically no difficulty."; break;
	case 5: sstr = "perfectly readable."; break;
	}
	switch (sw)
	{
	case 1: rstr = "Faint signals, barely perceptible"; break;
	case 2: rstr = "Very weak signals"; break;
	case 3: rstr = "Weak signals"; break;
	case 4: rstr = "Fair signals"; break;
	case 5: rstr = "Fairly good signals"; break;
	case 6: rstr = "Good signals"; break;
	case 7: rstr = "Moderately strong signals"; break;
	case 8: rstr = "Strong signals"; break;
	case 9: rstr = "Extremely strong signals"; break;
	}
	
	 System.out.println(rstr+", "+sstr);
	}
}
