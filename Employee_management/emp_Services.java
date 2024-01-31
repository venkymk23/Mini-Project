
import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeSet;

public class emp_Services {
	HashSet<Employee_details> empset = new HashSet<Employee_details>();

	Employee_details emp1 = new Employee_details(101, "Sheetal", 24, "Developer", "IT", 25000);
	Employee_details emp2 = new Employee_details(102, "Sachin", 24, "Developer", "IT", 30000);
	Employee_details emp3 = new Employee_details(103, "Vishwa", 23, "Tester", "CO", 30500);
	Employee_details emp4 = new Employee_details(103, "Venki", 25, "DevOps Eng", "Admin", 31000);

	Scanner sc = new Scanner(System.in);
	boolean found = false;
	int id;
	String name;
	int age;
	String department;
	String designation;
	double salary;

	public emp_Services() {
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
	}

	// view all employees

	public void viewAllEmp() {
		for(Employee_details emp:empset) {
			System.out.println(emp);
		}
	}
	//view emp based on there id
		public void viewEmp(){
		System.out.println("Enter id: ");
		id = sc.nextInt();
		for (Employee_details emp : empset) {
			if (emp.getId() == id) {
				System.out.println(emp);
				found = true;
			}
		}
		if (!found) {
			System.out.println("Employee with this id is not present");
		}
	}

	// update the employee
	public void updateEmployee() {
		System.out.println("Enter id: ");
		id = sc.nextInt();
		boolean found = false;
		for (Employee_details emp : empset) {
			if (emp.getId() == id) {
				System.out.println("Enter name: ");
				name = sc.next();
				System.out.println("Enter new Salary");
				salary = sc.nextDouble();
				emp.setName(name);
				emp.setSalary(salary);
				System.out.println("Updated Details of employee are: ");
				System.out.println(emp);
				found = true;
			}
		}
	}
	 // deleting employees
	
	public void deleteEmp() {
		System.out.println("Enter id");
		id=sc.nextInt();
		boolean found=false;
		Employee_details empdelete=null;
		for(Employee_details emp:empset) {
			if(emp.getId()==id) {
				empdelete=emp;
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully!!");
		}
	}
	
	 //add employees
	public void addEmp() {
		System.out.println("Enter id:");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("enter Desiganation");
		designation=sc.next();
		System.out.println("Enter Department");
		department=sc.next();
		System.out.println("Enter sal");
		sc.nextDouble();
		
		Employee_details emp=new Employee_details(id, name, age, designation, department, salary);
		
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employtee addeed successsfully");
	}
}

