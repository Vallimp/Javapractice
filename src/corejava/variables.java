package corejava;

public class variables {
//census in a city
	//instance variables change from object to object and they areinstance dependent
	String name;
	String address;
	//create one common variable to be used among all methods add access modifier static
//static variables are not dependent on instance, no matter how many instance u create the static variables dont change
//all static variables are class variables
	static String city; //memory uilization
	static int i;
	
//static block is used to initialize ur static variables
	static {
		city = "Bangalore";
		i= 0;
	}
	
//define a constructor with same arguments as watever is provided in main method
	//local variables
	variables(String name, String address) {
		//this is for instance variables
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);;
	}
	//write a method to get address
	public void getAddress() {
		//i value will be incremented from 1 to 2 here as its the same variable used across
		//if u remove i as static, then i remains same as it acts as instance variable, no sharing
		i++;
		System.out.println(address + " " + city);;
	}
	//if we declare a static method, it will allow only static variables, it will not accept address for example
	//static methods are class methods i.e we can call them with class name not object name check line number 47
	public static void getcity() {
		
		System.out.println(city);;
	}
	
	public static void main(String[] args) {
	//whenever this object is created the constructor is instantiated an 
	//the local variables are assigned to the instance variables and those are tied to the values in the main method
variables var =  new variables("Bob", "Marthalli");
variables var1 = new variables("Ajay", "Jayanagar");
var.getAddress(); //returns the first address
var1.getAddress(); //returns the second address
//static method called thru class, no object creation required
variables.getcity();
//u cal also assign values to static variables by accessing them thur the class
variables.i = 4;
	}
}
