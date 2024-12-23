import java.util.Scanner;
public class Num{
	public static void main(String[]args){
		Scanner b = new Scanner(System.in);
		System.out.print("plz enter num1");
		double num1 = b.nextDouble();
		System.out.print("plz enter num2");
		double num2 = b.nextDouble();
		System.out.print("plz enter num3");
		double num3 = b.nextDouble();
		if(num1>num2 && num1>num3){
			System.out.print("num1 is greater");
		}else if(num2>num1 && num2>num3){
			System.out.print("num2 is greater");
		}else{
			System.out.print("num3 is greater");
		}
		
	}
}