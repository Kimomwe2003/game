import java.util.Scanner;
public class Slope{
	public static void main(String[]args){
		Scanner r = new Scanner(System.in);
		System.out.print("plz enter x1");
		double x1 = r.nextDouble();
		System.out.print("plz enter x2");
		double x2 = r.nextDouble();
		System.out.print("plz enter y1");
		double y1 = r.nextDouble();
		System.out.print("plz enter y2");
		double y2 = r.nextDouble();
		double d = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.print("the distance is:" +d);
		
	}
}	