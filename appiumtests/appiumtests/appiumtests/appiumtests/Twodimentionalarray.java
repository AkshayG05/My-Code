package appiumtests.appiumtests;

public class Twodimentionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] []= {{1,2,3},{4,5,6}};  
		for(int i=0;i<2;i++) {  //for row
			
			for(int j=0;j<3;j++) { //for column
				

				System.out.print(arr[i][j]+ " ");
		}
			System.out.println();
	}

}
}