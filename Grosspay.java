import java.util.Scanner;
public class Grosspay{
   public static void main(String[]args){
	 Scanner t = new Scanner(System.in);
	 System.out.println("enter hours");
	 double hours = t.nextDouble();
	 System.out.println("enter rate");
	 double rate = t.nextDouble();
	 double Grosspay = hours*rate;
	 System.out.println("pay:"+Grosspay);
   }
}
   