package king;
import java.util.Scanner;
public class AgeScholar {

	public static void main(String[] args) {
		AgeScholarship();
		AgeScholar2();
	}
	
	private static void AgeScholarship() {
		Scanner AgeS=new Scanner(System.in);
		
		System.out.print("Enter your Age:");
		int Age=AgeS.nextInt();
		
		if (Age<=10) {
			System.out.println("According to your Age Group your Scholarship amount is Rs.1,000/-");
		}
		else if (Age>10 && Age<=16) {
			System.out.println("According to your Age Group your Scholarship amount is Rs.2,000/-");
		}
		else if (Age>16 && Age<=21) {
			System.out.println("According to your Age Group your Scholarship amount is Rs.3,000/-");
		}
		else {
			System.out.println("According to your Age Group your Scholarship amount is Rs.5,000/-");
		}
		AgeS.close();
	}
	
	private static void AgeScholar2() {
		Scanner AgeG=new Scanner(System.in); 
		System.out.print("Enter the Age Category (Child, Teen, Adult):");
		String Age=AgeG.next();
		
//		int age=0;
				
		if (Age.equalsIgnoreCase("Child"))
			System.out.println("According to your Age Group your Scholarship amount is Rs.1,500/-");
			
		else if (Age.equalsIgnoreCase("Teen"))
			System.out.println("According to you Age Group you Scholarship amount is Rs.3,000/-");
			
		else if (Age.equalsIgnoreCase("Adult"))
			System.out.println("According to your Age Group you Scholarship amount is Rs.6,000/-");
			
			
		else
			System.out.println("Invalid......Plz check the Category");
		
		AgeG.close();
	}
	
}
