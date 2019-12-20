package Abstraction_Concept;

public class Car extends Vehicle {
	
	void start() {
		System.out.println("Car starts with key.");
	}

	public static void main(String[] args) {
		// Vehicle v = new Vehicle();      Error "cannot instantiate type Vehicle 
		Car c = new Car();
		c.start();

	}

}
