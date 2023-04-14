package Inheritance;

public class childDemo extends parentDemo{

String name ="QAClickAcademy";

//constructor
public childDemo()
{
//	The super keyword refers to superclass (parent) objects. It is used to call superclass methods, 
//	and to access the superclass constructor. The most common use of the super keyword is to eliminate 
//	the confusion between superclasses and subclasses that have methods with the same name.
	
super();// this should be always be at first line
System.out.println("child class construtor");
}

public void getStringdata()
{
System.out.println(name);
System.out.println(super.name);
}

public void getData()
{
super.getData();
System.out.println("I am in child class");
}

public static void main(String[] args) {
// TODO Auto-generated method stub

childDemo cd = new childDemo();

cd.getStringdata();
cd.getData();
}

}