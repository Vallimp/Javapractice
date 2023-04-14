package Abstraction;

public abstract class ParentAirCraft {
//dont we need ain method in this parent class?
	public void Engine() {
		System.out.println("Enginesafety");
	}
	public void Safety() {
		System.out.println("Safetyguidelines");
	}
	public abstract void BodyColor(); //this has to be defines as an abstract method to be implemented in child class and also
	//class should be defines as abstract class
}
