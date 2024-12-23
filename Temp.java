import java.util.Scanner;
public class Temp{
	public static void main(String[]args){
		Scanner b = new Scanner(System.in);
		System.out.println("plz enter temperature");
		double temperature = b.nextDouble();
		double F = (9/5*temperature) +32;
		System.out.print("the temperature is:" +F);
	}
}