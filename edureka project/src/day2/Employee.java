package day2;

public class Employee{
	public Employee(){ 
	salary  = 4000;
	bonus = 100;
	}


public Employee(int salary, int bonus) {
	this.salary = salary;
	this.bonus = bonus;
}
int salary;
int bonus;

 void calculatesalary() {
	 int totalsalary = salary + bonus ;
	 System.out.println("Total Salary:"+ totalsalary);
 }
 
 int calculatesalary1() {
	 int totalsalary = salary + bonus ;
	 return totalsalary;
 }
	 
	 int calculatesalary2(int sal , int bon) {
		 int totalsalary = sal + bon ;
		 return totalsalary;
	 }
	 int calculatesalary3(int salary , int bonus) {
		 int totalsalary = salary + bonus ;
		 return totalsalary;
		 
	
		 }
		 
 }
 

