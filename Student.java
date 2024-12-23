import java.util.Scanner;
public class Student{
	public static void main(String[]args){
		Scanner t= new Scanner(System.in);
		System.out.println("plz enter your name");
		String name = t.nextLine();
		System.out.println("plz enter your address");
		String address = t.nextLine();
		System.out.println("plz enter your registration number");
		String regno = t.nextLine();
		System.out.println("plz enter your age");
		int age = t.nextInt();
		System.out.println("plz enter your GPA");
		double GPA = t.nextDouble();
		System.out.println("plz enter your quote");
		String quote = t.nextLine();
		System.out.println("your name is:" +name);
		System.out.println("your address is:" +address);
		System.out.println("your registration number is:" +regno);
		System.out.println("your age is :" +age);
		System.out.println("your GPA is:" +GPA);
		System.out.println("your quote is:\""+quote +"\"");
		
	}	
}		
		
		
		