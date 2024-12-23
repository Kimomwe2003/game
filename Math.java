import java.util.Scanner;
public class Math{
	public static void main(String[]args){
		Scanner g = new Scanner(System.in);
		System.out.print("plz enter r");
		double r = g.nextDouble();
		double Volume = (4/3)*Math.Pi*Math.pow(r,3);
		double Area = 4*Math.Pi*Math.pow(r,2);
		System.out.print("the volume is:" +Volume);
		System.out.print("the area is:" +Area);
	}
}	