import java.util.Scanner;
public class Area{
	public static void main(String[]args){
		Scanner g = new Scanner(System.in);
		System.out.print("plz enter value of a");
		double a = g.nextDouble();
		System.out.print("plz enter value of b");
		double b = g.nextDouble();
		System.out.print("plz enter value of c");
		double c = g.nextDouble();
		double sides = (a+b+c)/2;
		double A = Math.sqrt(sides*(sides-a)*(sides-b)*(sides-c));
		System.out.println("the side is:" +sides);
		System.out.println("the area is:" +A);
		
		
	}
}