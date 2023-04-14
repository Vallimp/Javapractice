package corejava;

public class sortanarray {
	
	public static void main(String[] args) {
		int a[]= {2,6,1,4,9};
	     int temp;
	    //compare the first index number with the next remaining numbers and keep swapping until the end, bubble sort
	     //from above array compare 2 and 6 its fine 2 is less than 6
	     //then compare 2 and 1, 1<2 so swap 1 and 2 so array will be 1,6,2,4,9
	     //now compare 6 and 2 and swap 1,2, 6, 4, 9
	     //compare 6 and 4 now and swap 1,2, 4, 6,9
	// 1,2,4,6, 9
	     
	     for(int i=0;i<5;i++)
	     {
	    for(int j=i+1;j<5;j++)
	    {
	    if(a[i] > a[j])
	    {
	    temp=a[i]; //refer below logic of taking a temp variable fr swapping
	    a[i]=a[j];
	    a[j]=temp;
	   
	    }
	    }
	     }
	for(int i=0;i<5;i++)
	{
	System.out.println(a[i]);
	}


	/* int a= 5;
	int b =4;
	/*int temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println(a);
	System.out.println(b);
	// Swap with out variable

	a=a+b;  // a= 9
	b=a-b;  //b = 5
	a=a-b; // a= 4  */



	      
	      

	}
	}


