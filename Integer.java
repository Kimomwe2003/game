import java.util.Scanner;
public class Integer{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("plz enter value of a");
		double a =scanner.nextDouble();
		System.out.print("plz enter value of b");
		double b =scanner.nextDouble();
		System.out.print("plz enter value of c");
		double c =scanner.nextDouble();
		System.out.print("plz enter value of d");
		double d = scanner.nextDouble();
		System.out.print("plz enter value of e");
		double e = scanner.nextDouble();
		if(a==b || a==c || a==d || a==e || b==c || b==d || b==e || c==d || c==e ||d==e){
			System.out.print("HAS DUPLICATE");
		}else{
			System.out.print("ALL ARE UNIQUE");
		}
		
	}	
		
}