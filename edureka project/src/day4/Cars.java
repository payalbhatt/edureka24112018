package day4;

public class Cars extends Machine{
	public Cars() {
		System.out.println("Cars constructor");
	
		
		engineSize = 500;
		
	}
public void restart() {
	
	numberOfSeats=5;
	
	System.out.println(" Restart method form Cars class");
}
 public void open() {
	 System.out.println("Open method from Cars class");
	 
	
	
}
 @Override
 public void stop() {
	 System.out.println(" I am an over ridden method");
	 
	 
	 
	 
 }
}