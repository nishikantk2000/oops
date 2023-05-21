package abstractclass;

public abstract class Car {

	
		public abstract void start();
		public abstract void accelerate();
		public abstract void stop();
	}
	 class Tata extends Car{
		 @Override
		public void start() {
			System.out.println("Tata start method");
		}
		 @Override
		public void accelerate() {
			System.out.println("Tata accelerate method");
			
		}

		 @Override
		public void stop() {
			System.out.println("Tata stop method");
			
		}
	}

	


