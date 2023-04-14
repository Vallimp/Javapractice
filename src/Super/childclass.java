package Super;

public class childclass extends parentclass {

	String name = "QA Tester";
	
	//create a constructor
		public childclass() {
			super(); //this should be given as the first line to get the parent class constructor to get executed
			System.out.println("this is child class constructor");
		}
	//create a method
		public void getData() {
			super.getData(); //method from parent class gets executed 
			System.out.println("this is child class method");
		}
		
		public void getStringData() {
			//local string name will be printed
			System.out.println(name);
			//string defined in the parent class will be displayed as we have used the super keyword
			System.out.println(super.name);

		}
	
	public static void main(String[] args) {
		//when this object is created the child class methis or constructirs take preceedence over parentclass
		//as there are same constructors and methods in both classes and parent properties acquired with extends keyword
		//until unless super keyword is specified as the first line of code in the constructor or the method of 
		//child class, the child class methods only get executed
		childclass cd = new childclass();
		//check comments in getstringdata method
		cd.getStringData();
		cd.getData();
		
		
	}
}
