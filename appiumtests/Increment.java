package appiumtests;

import java.util.Scanner;

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Input from the user:- ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee new  CTC: ");
		double current = sc .nextInt();
		
		System.out.println("Enter the old  CTC: ");
		double old = sc .nextInt();
	
	//	System.out.println("Enter the Expected  CTC: ");
	//	double exp = sc .nextInt();
	
		
		double diff  = current - old;
		double res = (diff/old*100);
	//	double diff2 = exp - old;
	//	double res1 = (diff2/old*100);
		
		System.out.println("The Employee Got Hike Percentage on new CTC "+ Math.round(res));
		
	}

}
