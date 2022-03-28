package appiumtests;

import java.util.Scanner;

public class usersinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Input from the user: "); //to write the user
		 
		Scanner sc = new Scanner(System.in);//Read from the keyboard,important function to read .
		//System.out.println("Enter num1: ");
		//float  a = sc.nextFloat();
		//int a = sc .nextInt();
		
		//System.out.print("Enter num2: ");
		//int b = sc .nextInt();  // to check int numbers add
		//float  b = sc.nextFloat(); // float num  addition
		// boolean b = sc.hasNextFloat(); // to check boolean true or false
		//int Sum = a+b;
		//float result = a+b;
		 //boolean C = b;
		//System.out.print("Enter Sum: ");
	//	System.out.println("The Sum of the Numbers are :");
		//System.out.print(Sum); 
		//System.out.print(result);
		//System.out.println(b);
	//String str = sc.next(); // for a one word to print 
		String str = sc.nextLine(); // for the sentence to print in a line
	System.out.print(str);
	
		
		
	}

}
