package day2;

public class GreatestOutOfTwoNumbers {

	public static void main(String[] args) {

		int firstnum, secondnum;

		firstnum = 100;
		secondnum = 100;

		if (firstnum > secondnum) {

			System.out.println("firstnum is greatest");

			if (secondnum > firstnum) {
				System.out.println("secondnum is greatest");
			}

		} else {
			System.out.println("both are equal");
		}
	}

}
