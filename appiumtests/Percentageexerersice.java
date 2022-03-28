package appiumtests;

import java.util.Scanner;

public class Percentageexerersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int out_marks = 500;
	
		
		System.out.println("Input from the user:- "); //to write the user
		 
		Scanner sc = new Scanner(System.in);//Read from the keyboard,important function to read .
		System.out.println("First Subj  English");
		System.out.println("Enter obt_marks For ENG : ");
		double obt_marks1 = sc .nextInt();
		System.out.println("Second Subj Maths");
		System.out.println("Enter obt_marks For Math : ");
		double obt_marks2 = sc .nextInt();
		System.out.println("Third Subj  Science");
		System.out.println("Enter obt_marks For Sci : ");
		double obt_marks3 = sc .nextInt();
		System.out.println("Fourth Subj History");
		System.out.println("Enter obt_marks For hist : ");
		double obt_marks4 = sc .nextInt();
		System.out.println("Fifth Subj Geography");
		System.out.println("Enter obt_marks For Geo  : ");
		double obt_marks5 = sc .nextInt();
		//System.out.println("Enter out_marks for 5 subj : ");
		//double Out_marks = sc.nextInt();
	
		double avg = (obt_marks1+obt_marks2+obt_marks3+obt_marks4+obt_marks5);
		double Sum = (avg / out_marks * 100);
		System.out.println("The total Marks % For All Subj : "+Sum);
		
	}

}
