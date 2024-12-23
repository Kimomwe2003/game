import java.util.Scanner;
public class Bustour{
	public static void main(String[]args){
		Scanner g = new Scanner(System.in);
		System.out.print("plz enter participants");
		int participants = g.nextInt();
		int revenue = participants*2500;
		System.out.print("the revenue is:" +revenue);
	}
}	