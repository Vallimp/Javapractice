package corejava;

public class stringmethods {
	//two types of intialization in strings
	//1. string literal, when u declare like this an obkect will be created and hello will be assigned to that
	//but when there is another variable with same string, it does not create another object but assigns same hello 
	//to variable b
	//String a="hello"; 
	//2. String intializaton using an object
	//here irrespective of whether the string is same,it creates a object for second string also as we are creating it
	//String b= new String("hello");
	
	public static void main(String[] args) {

	String a = " java training";
	//gives the character at index 2
	System.out.println(a.charAt(2));
	//returns index of the character, if e is not present it returns -1 as index
	System.out.println(a.indexOf("e"));
	//returns the string inbetween index 3 and index 6
	System.out.println(a.substring(3,6));
	//returns string from index 5 to the end
	System.out.println(a.substring(5));
	//concatenates the sting with string a
	System.out.println(a.concat("valli learning"));
	//trims white spaces before and after the string if any
	System.out.println(a.trim());
	//converst the string to uppercase
	System.out.println(a.toUpperCase());
	//converst the string to lowercase
	System.out.println(a.toLowerCase());
	//splits the string before and after 't'
	String arr[]=a.split("t");
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	//replaces t with s
	System.out.println(a.replace("t", "s"));

	}
}
