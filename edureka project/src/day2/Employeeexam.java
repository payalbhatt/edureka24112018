package day2;

public class Employeeexam {
public static void main(String[] args) {
	
	
	// Declaring a variable
	Employee Nirav;
	
	//Instantiation and Initialization
	Nirav = new Employee();
	 Nirav.salary= 10000;
	 Nirav.bonus= 5000;
	 Nirav.calculatesalary();
	 
			 
	Employee Kira= new Employee();
	Kira.salary = 9000;
	Kira .bonus = 500;
	
	int salary = Kira .calculatesalary1();
	System.out.println("Kira's salary:"+ salary);
			
	
	
}
}
