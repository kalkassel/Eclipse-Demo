package LabExercise;
/*
 * / Create two class Employee and EmployeeTest. where Employee is the public class and 
 * has four variables called name, age, designation and salary. 
  */

//This is the class (a class which is not the source file class name)
class EmployeeTest1 {
	
	// declaring instant variables.
	String name;
	int age;
	String department;
	int experience;
	String designation;
	double salary;
	
	// The constructor which have the same name as the class above.
	public EmployeeTest1(String empName) {
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
	
	// Assigning variable department as method.
	public void empDepartment(String department) {
		this.department = department;
	}
	
	// Assigning variable experience as method.
	public void empExperience(int experience) {
		this.experience = experience;
	}
	// Assigning variable designation as method . 
	public void empDesignation(String designation) {
		this.designation=designation;
	}
	
	// Assigning variable salary as method.	
	public void empSalary(double salary) {
		this.salary=salary;
	}
	
	// Displaying the employee information using method 
	public void displayEmpInfo() {
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Department: "+ department);
		System.out.println("Experience: "+ experience);
		System.out.println("Designation: "+ designation);
		System.out.println("Salary: "+ salary);
	}
	
}

public class GitOnEclipce {

	public static void main(String[] args) {
		 
		// Declaring the employee object using the constructor class 
				EmployeeTest1 empOne = new EmployeeTest1("John_Smith");
				EmployeeTest1 empTwo = new EmployeeTest1("William_Gibbsen");
				
				// Accessing the employee info using object declared for employee one. 
				empOne.setAge(34);
				empOne.empDepartment("Mobile app development");
				empOne.empExperience(10);
				empOne.empDesignation("Senior Engineer and Devoloper.");
				empOne.empSalary(250000.0);
				empOne.displayEmpInfo();
				System.out.println("--------======-------------");
				
				// Accessing the employee information using object declared for employee two.
				empTwo.setAge(36);
				empTwo.empDepartment("Mobile app development");
				empTwo.empExperience(10);
				empTwo.empDesignation("Engineer and Devoloper.");
				empTwo.empSalary(150000.0);
				empTwo.displayEmpInfo();
	}

}
