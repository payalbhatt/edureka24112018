package day4;

public class Democar {

	public static void main(String[] args) {
		
		Machine mac = new Machine();
		
		mac.start();
		mac.stop();
		mac.numberOfSeats= 6;
		
		System.out.println(mac.engineSize);
		
		System.out.println("-----------");
		Cars alto = new Cars();

		alto.start();
		alto.stop();
		alto.open();
		alto.restart();
		System.out.println(alto.engineSize);
		System.out.println("-----------");
		Machine bmw = new Cars();
		bmw.start();
		bmw.stop();
		System.out.println(bmw.engineSize);
		
	

	}

}
