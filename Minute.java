import java.util.Scanner;
public class Minute{
	public static void main(String[]args){
		Scanner c = new Scanner(System.in);
		System.out.println("plz enter minutes");
		int minutes = c.nextInt();
		int hours = minutes/60;
		int days = hours/24;
		int year = days/365;
		System.out.println("number of years is:" +year);
		System.out.println("number of days is:" +days);
		
		
	}
}