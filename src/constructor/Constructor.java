package constructor;
class Employee{
	int employee_id;
	double employee_salary;
	
	Employee(){
		employee_id=32;
		employee_salary=50000;
		
	}
	void show() {
		System.out.println("employee_id "+employee_id);
		System.out.println("employee_salary "+employee_salary);
		
	}
}
public class Constructor {
	public static void main(String args[]) {
		Employee shiva=new Employee();
		shiva.show();				
	}

}
