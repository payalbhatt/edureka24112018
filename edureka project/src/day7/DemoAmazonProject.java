package day7;



public class DemoAmazonProject {	

	public static void main(String[] args) {
		
		 AmazonProject ap =  new AmazonProject();
		 ap .invokeBrowser("chrome");
        ap.searchProduct("Refrigerator","Appliances");
        
        ap.printNthProduct(4);
      //  ap.printAllProducts();
       // ap.printAllProductsViaScrollDown();
        ap.printAllProductsViaScrollDownUsingJS();
        
        
	} 

}
