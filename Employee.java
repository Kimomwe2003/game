import java.util.Scanner;
public class Employee{
	public static void main(String[]args){
		Scanner g = new Scanner(System.in);
		System.out.println("plz enter performance");
		double performance = g.nextDouble();
		System.out.println("plz enter salary");
		double salary = g.nextDouble();
	if(performance >=0 && performance <=100){
		if(performance>=90){
	    double newsalary = 0.03*salary;
		salary = salary + newsalary;
		System.out.println("the salary is:" +salary);
		
		}else{
		System.out.println("the salary is:" +salary);
			
		}
	}else{
		System.out.println("invalid performance:");
		
	}
	}
}	
		