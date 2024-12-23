import java.util.Scanner;
public class Me{
	public static void main(String[]args){
		Scanner m = new Scanner(System.in);
		System.out.println("plz enter your NAME");
		String NAME = m.nextLine();
		System.out.println("plz enter your CITY");
		String CITY = m.nextLine();
		System.out.println("plz enter AGE");
		int AGE = m.nextInt();
		System.out.println("plz enter COLLEGE");
		String COLLEGE = m.nextLine();
		String m.nextLine();
		System.out.println("plz enter PROFFESSION");
		String PROFFESSION = m.nextLine();
		System.out.println("plz enter PETNAME");
		String PETNAME = m.nextLine();
		System.out.println("there once a person named" +NAME);
		System.out.println("Who lived in city" +CITY);
		System.out.println("At the age of" +AGE);
		System.out.println("Went to college" +NAME  +COLLEGE);
		System.out.println("Graduated and went to work as proffesion"  +NAME +PROFFESSION);
		System.out.println("Adopted aniamal named PETNAME they both lived happily ever after" +NAME +PETNAME);
		
		}
} 