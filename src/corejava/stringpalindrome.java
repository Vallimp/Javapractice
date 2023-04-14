package corejava;

public class stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//to print the string in reverse order
		String a = "Valli";
		//just to make its prining from last when a palindrome is given as a string
		String t ="";
		for( int i=a.length()-1;i>=0;i--){
			{
				//concatenate string t and the index retrieved each time
				t=t+a.charAt(i);
			}
		}
		System.out.println(t);
		if (a==t)
	{
		System.out.println("It is not a palindrome");
		//System.out.println("It is a palindrome");

	}

}
}
