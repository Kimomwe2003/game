import java.util.Scanner;
public class NaturalNumber{
	public static void main(String args[]){
		Scanner o = new Scanner(System.in);
		System.out.print("plz enter number:");
		int number = o.nextInt();
		int sum = 0;
		for(int i = 1; i <= number; i++){
			sum++;
		}
		System.out.println("the sum of number is:"+number +sum);
		
	}
}