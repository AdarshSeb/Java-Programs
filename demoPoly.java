package easy;

public class demoPoly {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2  = new Manager();
		Manager manager = new Manager();
	
		
		emp1.getDetails();
		

	}

}
 class Employee{
	public String name = "Adarsh";
	
	public void getDetails() {
		System.out.println("name from employee class"+name);	}
}
 class Manager extends Employee{
	public String name = "Appu";
	public String department = "IT";
	
	public void setDepartment() {
		department="CS";
	}
	
	public void getDetails() {
		System.out.println("name from Manager class"+name);	}
}