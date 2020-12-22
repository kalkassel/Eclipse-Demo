package LabExercise;
/* Create two class Employee and EmployeeTest. where Employee is the public class and 
 * has four variables called name, age, designation and salary. 
 */

// This is the class (a class which is not the source file class name)
class EmployeeTest {
	
	// declaring instant variables.
	String name;
	int age;
	String designation;
	double salary;
	double bonus;
	
	// The constructor which have the same name as the class above.
	public EmployeeTest(String empName) {
		name=empName;
	}
	
	// Assigning the value of the variable age using getters.
	public int getAge() {
		return age;
	}
	
	// Assigning the value of the variable age using setters.
	public void setAge(int age) {
		this.age = age;
	}
	
	// Assigning variable designation as method . 
	public void empDesignation(String designation) {
		this.designation=designation;
	}
	
	// Assigning variable salary as method.	
	public void empSalary(double salary) {
		this.salary=salary;
	}
	public void setBonus(double newBonus) {
		bonus = newBonus;
	}
	public double getBonus() {
		return bonus;
	}
	
	// Displaying the employee information using method 
	public void displayEmpInfo() {
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Designation: "+ designation);
		System.out.println("Salary: "+ salary);
		System.out.println("Bonus: " + bonus);
	}
	
}
public class Employee {
	
	public static void main(String[] args) { 
		
		// Declaring the employee object using the constructor class 
		EmployeeTest empOne = new EmployeeTest("John_Smith");
		EmployeeTest empTwo = new EmployeeTest("William_Gibbsen");
		
		// Accessing the employee info using object declared for employee one. 
		empOne.setAge(34);
		empOne.empDesignation("Senior Engineer and Devoloper.");
		empOne.empSalary(250000.0);
		empOne.setBonus(5000.0);
		empOne.displayEmpInfo();
		
		
		System.out.println("--------======-------------");
		
		// Accessing the employee information using object declared for employee two.
		empTwo.setAge(36);
		empTwo.empDesignation("Engineer and Devoloper.");
		empTwo.empSalary(150000.0);
		empTwo.setBonus(7000.0);
		empTwo.displayEmpInfo();
		
	}

}
