package Abstraction;

public class ChildAirCraft extends ParentAirCraft {

	public static void main(String[] args) {
//remember it will not alow us to instantiate Parent Aircraft as there is abstract beside the parent class
   ChildAirCraft cd = new ChildAirCraft();
   cd.Engine();
   cd.Safety();
   cd.BodyColor();
	
	}
	
	@Override
	public void BodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}

}
