package Abstraction_Concept;

public class Scooter extends Vehicle{
		
		void start() {
			System.out.println("Scooter starts with kick.");
		}

		public static void main(String[] args) {
			// Vehicle v = new Vehicle();      Error "cannot instantiate type Vehicle 
			Scooter s = new Scooter();
			s.start();

		}

	}



