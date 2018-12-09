package day3;

public class DemoGuru99Project {

	public static void main(String[] args) {
		
				 Guru99Project guru = new Guru99Project();
				 
				 guru.invokeBrowser();
				 guru.login("mngr150997","mudEzan");
				 guru.addCustomer() ;
				 String CustomerId = guru.getCustomerId();
				 System.out.println("Customer Id:"+  CustomerId);
 	
	guru.addAccount(CustomerId);
	}
}
