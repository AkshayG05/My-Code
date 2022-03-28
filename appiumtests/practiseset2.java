package appiumtests;

public class practiseset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Three Subj calculate CGPA 
		
		double subj1 = 40;
		double subj2 = 50;
		double subj3 = 35;
		double CGPA = ((subj1+subj2+subj3)/30);
		
		System.out.println("The CGPA of the three subjects are as follow: " +CGPA);
		
		//Add all the subj marks and then divide them by the total subj count and there is your CGPA
		
		//for CGPA to percentage conversion
		
		double Per = (CGPA*9.5); 
		System.out.println("The Percentage of the three subjects are as follow: " +Per);

	}

}
