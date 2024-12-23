import java.util.Scanner;
public class Studant{
	public static void main(String[]args){
		Scanner c = new Scanner(System.in);
		System.out.println("plz enter ur name");
		String name = c.nextLine();
		System.out.println("plz enter address");
		String address = c.nextLine();
		System.out.println("plz enter registration number");
		String registrationnumber = c.nextLine();
		System.out.println("plz enter age");
		int age = c.nextInt();
		System.out.println("plz enter GPA");
		double GPA = c.nextDouble();
		c.nextLine();
		System.out.println("plz enter favourite quote");
		String quote = c.nextLine();
		System.out.println("your name is:" +name);
		System.out.println("your address is:" +address);
		System.out.println("your registrationnumber is:" +registrationnumber);
		System.out.println("your age is:" +age);
		System.out.println("your GPA is:" +GPA);
		System.out.println("your favouritequote is:" +quote);

		
		
		
		
	}
}