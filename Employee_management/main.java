
import java.util.Scanner;
public class main {

	emp_Services services = new emp_Services();
	static boolean ordering = true;
	public static void menu() {
	System.out.println("****************Welcome To Employee Managment System *********** "
    		+ "\n1. Add Employee "
    		+ "\n2.View Employee "
    		+ "\n3.Update Employee "
    		+ "\n4. Delete Employee "
    		+ "\n5.View All Employee ");	
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	emp_Services services = new emp_Services();
	
	do {
		menu();
		System.out.println("Enter your Choice");
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:
			System.out.println("Add Employee");
			services.addEmp();
			break;
		case 2:
			System.out.println("View Employee");
			services.viewEmp();
			break;
		case 3:
			System.out.println("Update Employee");
			services.updateEmployee();
			break;
		case 4:
			System.out.println("Delete Employee");
			services.deleteEmp();
			break;
		case 5:
			System.out.println("view All Employee");
			services.viewAllEmp();
			break;
		case 6:
			System.out.println("Thank you for using application!!");
			System.exit(0);
			
		default:
			System.out.println("Please enter valid choice");
			break;
		
		
		}
		
	}while(ordering);
	
		}
	
}