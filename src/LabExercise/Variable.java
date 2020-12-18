package LabExercise;

public class Variable 
{
	/* We had different variable types.
	 * 	local variable
	 * 	instance variable
	 * 	class /static variable
	 * 
	 * */
	
	// defining local variable method
	public void showAge()
	{
		int age =40;           // variable declaration
		age = age +2;
		
		System.out.println("The value of age :"+ age);
		
	}
	
	// defining instance variable method
	public String name;
	private double salary;
	
	
	public Variable(String Name)     // declaring constructer method
	{
		 name = Name;
	}
	
	public void setSalary(double empSalary)   // declaring method takes parameters 
	{
		salary = empSalary;
	}
	
	public void Display()                // declaring a method
	{
		System.out.println("Name of the Employee is : "+ name);
		System.out.println("The salary of the Employee is : "+ salary);
	}
	
	// using static/ class variable

	private static double salary1;
	public static final String department = "Development";
	
	// main function 
	public static void main(String[] args) 
	{
		Variable local = new Variable("");    // declaring the object for the local variable method
		local.showAge();
		
		Variable instance = new Variable("James");      // declaring the object for the instance variable method
		instance.setSalary(200000);
		instance.Display();
		
		Variable.salary1 = 1000;                // declaring the static variable
		System.out.println(department + " avarage " + salary1);
		
	}

}
