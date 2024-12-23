import java.util.Scanner;
public class Calcu{
	public static void main(String[]args){
		Scanner g = new Scanner(System.in);
		System.out.print("plz enter value of a");
		int a = g.nextInt();
		System.out.print("plz enter value of b");
		int b = g.nextInt();
		int add  = a+b;
		int subc = a-b;
		int mult = a*b;
		int div  =a/b;
		System.out.print("the value of add is:" +add);
		System.out.print("the value of subc is:" +subc);
		System.out.print("the value of mult is:" +mult);
		System.out.print("the value of div is:" +div);
		
	}
}	
		