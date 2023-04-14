package corejava;

public class stringimmutable {
	
	public static void main(String[] args) {

	String a = "hello";//string literal - immutble java strings
	String b = "hello";
	a.concat(" world");
	String s = new String("hello");
	String s1 = new String("Hello");

	System.out.println(a);
	
	//line number 10 doesnt concatenate hello and world as these string class strings are immmutable
	//it means it doesnt change the actual varaiable a which is hello but we can change it
	//by assigning the concat funcion to another variable. it doesnt alter the original string a in the former case
	//for this purpose we have mutable string classes called as String buffer class
	
	//difference between equals to and ==
	//equals method compares the content whereas the latter compares the reference
	
	System.out.println(a.equals(b)); //returns true
	System.out.println(a==b); //true
	System.out.println(a.equals(s));//true as it checks for content
	System.out.println(a==s);//false because it checks for reference 
	//and as the object references are different, it returns false
	System.out.println(s==s1);//returns false as references are different as they are defined using string class
	System.out.println(a.equalsIgnoreCase(s1)); //ignore the case and returns true if the string is true
	
	
	//String buffer is thread safe and mutable
	//string buffer runs one after the other
	
	StringBuffer sb = new StringBuffer("hello");
	sb.append("world");
	System.out.println(sb);
	sb.insert(2, "She"); //heShelloworld
	System.out.println(sb);
	//It will replace 5th and 6th characters with the string provided and not 7th as its the boundary
	sb.replace(5, 7, "aa"); //heSheaaoworld
	System.out.println(sb);
	sb.deleteCharAt(12);//heSheaaworl
	System.out.println(sb);
	sb.reverse(); //reverses the string
	System.out.println(sb);
	
	//String buidler is not threadsafe. it is non synchronized
	//it means if we are using the same variable across different tests in an automation project
	//the string builder will make sure the operations using that object are performed in 
	//in parallel. it allows modifications to be made on the existing object at the same time
	//instead of one after another so string builder is faster than string buffer
	//its safe to use string builder in cases of parallel testing

	}


}
