package appiumtests;

import java.util.Scanner;

public class asstoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a = 7/4.0f *  9/2.0f;   // asst no:1
		System.out.println(a);		
	
		//encrypt a grade by adding 8 to it and decrypt it to show the correct grade.
		
		char grade = 'A';
		grade = (char )(grade +  8);
		System.out.println(grade);
		
		grade = (char )(grade -8);
		System.out.println(grade);
		
   // use camparison operator and find out given number is greater than the user entered number or not 
		
		Scanner sc = new Scanner(System.in);
		
		int z = sc.nextInt();
	System.out.println(z>8);	

	int v = 77;
	int u = 98;
	int g = 87;
	//System.out.println((v^2-u^2)/(2*g*5));
	System.out.println((v*v-u*u)/(2*g*5));
	
	
	}

}
