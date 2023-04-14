package corejava;

public class minimumarray {

	//To find out the minimum number in a two dimensional array
	
/*	2 4 5
	3 4 7
	1 2 9 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring an array
		int a[][] = {{2,4,5},{3,4,7},{1,2,9}};
		
	//Now assume that the minimum number is the first element of the matrix or array
		int min = a[0][0];
		//outer loop has to run 3 times as there are 3 rows
		 for (int i =0;i<3;i++){
			 {
				 //inner loop has to run 3 times as there are 3 columns
				 for (int j=0; j<3; j++)
				 {
					 if (a[i][j]<min)
					 {
						 min = a[i][j];
					 }
				 }
			 }
		 }
		System.out.println(min);
	
	
	}
}
