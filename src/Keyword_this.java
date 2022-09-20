class Person {
	int eid;
	double salary;
	static String company;
	
	Person(int eid,double salary){
		this("Infosys ");
	
		this.eid=eid;
		this.salary=salary;
		this.show();
	}
	
	 Person(String company ) {
		 Person.company=company;
	 }	
	void show() {
		
		System.out.println("employee_id "+eid);
		System.out.println("employee_salary "+salary);
		System.out.println("company"+company);
		
	}
}
public class Keyword_this {
	public static void main(String args[]) {
		Person shiva=new Person(1024,8400);
		
		Person p=new Person(25,25000);
	
		
	}

}
