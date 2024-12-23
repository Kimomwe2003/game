import java.util.Scanner;
public class Temperature{
    public static void main(String[]args){
	 Scanner t = new Scanner(System.in);
	 System.out.println("enter Temperature");
	 double Temp = t.nextDouble();
	 double farenheit = (9/5*Temp)+32;
	 System.out.println("farenheit is :"+farenheit);
	}
	
}
	