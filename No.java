import java.util.Scanner;
public class No{
	public static void main(String[]args){
		Scanner y = new Scanner(System.in);
	    System.out.print("plz enter value of x");
		int x = y.nextInt();
		if(x>=0 && x<=100){
			System.out.print("OK");
		}else{
			System.out.print("OUT OF RANGE");
		}
	}
}