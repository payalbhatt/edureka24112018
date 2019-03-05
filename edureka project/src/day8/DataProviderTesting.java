package day8;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTesting {
	
	@Test(dataProvider =" getData")
	public void printAllData(String UserID,String Password) {
		System.out.println("User ID:"+ UserID+"And Password:"+ Password);
	}
	@DataProvider
	public String[][]getData(){
		String[][] data = new String[3][2];
		
		data[0][0]="payalbhatt16@gmail.com";
		data[0][1]="plumroof839";
		
		data[1][0]="kirabhatt17@gmail.com";
		data[1][1]="plumroof83";
		
		data[2][0]= "pb14@gmailcom";
		data[2][1]="plum000";
		return data;
	}

}
