package corejava;

public class Trickyarray {
	
	public static void main(String[] args) {

//to find the minimum number in the array and then identify the maximum number 
//in the column which the minimum number belongs to
	
/*	2 4 5
	3 0 10
	1 2 9 */
		
	int a[][] = {{2,4,5},{3,0,10},{1,2,9}};
	int min= a[0][0];
	int mincolumn=0;
	
	for (int i=0;i<3; i++)
	{
		for (int j=0; j<3; j++)
		{
			if (a[i][j]<min)
			{
				min= a[i][j];
//assigning the column of the corresponding row to a variable in which the minimum number is present
				mincolumn = j; 
			}
		}
	}
	int max=a[0][mincolumn];
	int k=0;
	while(k<3)
	{
		if (a[k][mincolumn]>max)
		{
			max=a[k][mincolumn];
		}
		k++;
	}
	System.out.println(max);

  }
}
