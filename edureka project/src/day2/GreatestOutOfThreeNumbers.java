package day2;

public class GreatestOutOfThreeNumbers {
public static void main(String[] args) {
	 
	
	int firstno , secondno , thirdno ;
	
	firstno = 10;
	secondno = 11;
			thirdno = 12;
	
	if( firstno > secondno && firstno > thirdno) {
		System.out.println("firstno is greatest");
	} else if(secondno > firstno && secondno > thirdno) {
		System.out.println("secondno is greatest");
	} else if(thirdno > firstno &&  thirdno > secondno) {
		System.out.println("thirdno is greatest");
	} else {
		System.out.println("all the numbers are equal");
		
	}
}
}
