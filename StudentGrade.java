import java.util.Scanner;
public class StudentGrade{
	public static void main(String args[]){
		Scanner m = new Scanner(System.in);
		System.out.println("plz enter no of students");
		int no = m.nextInt();
		int score =m.nextInt();
		double score;
		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countD = 0;
		int countE = 0;
		int countF = 0;
		
		for(int i = 1; i< no; i++);
		System.out.println("plz enter score ); 
		score =m.nextDouble();
		if(score >= 90 && score <= 100){
			System.out.println("A");
			countA++;
		}
		else if(score >= 80 && score <= 89){
			System.out.println("B");
			countB++;
			
		}
		else if(score >= 70 && score <= 79){
			System.out.println("C");
			countC++;
			
		}
		else if(score >= 60 && score <= 69){
			System.out.println("D");
			countD++
			
		}
		else if(score >= 50 && score <= 59){
			System.out.println("E");
			countE++
			
		}
		else if(score >=40 && score <= 0){
			System.out.println("F");
			countF++
		}
		else
			Sytem.out.print("invalid");
		
		
	}
	System.out.println("the no of student with grade:" +countA);
	System.out.println("the no of student with grade:" +countB);
	System.out.println("the no of student with grade:" +countC);
	System.out.println("the no of student with grade:" +countD);
	System.out.println("the no of student with grade:" +countE);
	System.out.println("the no of student with grade:" +countF);
}