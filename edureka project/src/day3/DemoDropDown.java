package day3;

public class DemoDropDown {

	public static void main(String[] args) throws InterruptedException {
		
				 Dropdown guru = new Dropdown();
				 
				 guru.invokeBrowser();
				 guru.login("mngr150997","mudEzan");
				 guru.addCustomer() ;
				 String CustomerId = guru.getCustomerId();
				 System.out.println("Customer Id:"+  CustomerId);
 	
	guru.addAccount(CustomerId);
	}
}
