package day4;

public class Machine {
	int engineSize;
	protected int numberOfSeats;
	private int numberOfWheels;
	
	
	public Machine() {
		System.out.println(" Machine constructor");
		
		engineSize = 1000;
		numberOfWheels = 4;
	}
	public void start() {
		System.out.println("start method from Machine");
		
	}
 public void stop() {
	 System.out.println(" stop method from Machine");
 }
}
