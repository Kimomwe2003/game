import java.util.Scanner;
public class Tour{
	public static void main(String[]args){
		Scanner p = new Scanner(System.in);
		System.out.print("plz enter participant");
		int participant = p.nextInt();
		double revenue=participant*2500;
		System.out.print("the revenue is $:"+revenue");
		
		
	}
}
