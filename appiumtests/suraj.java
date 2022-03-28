package appiumtests;

import java.util.Scanner;

public class suraj {

	public static int sk=0; 
	public static int my=0;
	
	public static void main(String[] args) {
		
	System.out.println("Input from the user:- "); //to write the user
	 
	Scanner sc = new Scanner(System.in);
	 for(int i=1; i<=5;i++)
	 {
		 System.out.println("enter "+i+" st subject marks");
		 sk = sc .nextInt();
		 my = sk+my;
	 }
	 System.out.println("Mytotal marks is "+my);
	 
	 System.out.println("Enter out of marks");
	 double out_of = sc .nextInt();
	 
	 double percent = (my / out_of * 100);
	 double my1=my;
	 System.out.println(my1 +" my1 is");
	 
	 System.out.println("Your examination percentage is "+percent);
}
}