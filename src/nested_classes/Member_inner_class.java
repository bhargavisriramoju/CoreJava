package nested_classes;

class University{
	
	void announcement() {
		System.out.println("exams start from 1st october");

	
	class Department{
		void prepare() {
			System.out.println("Question paper takes 10 days time");
		}
	}
	Department cse=new Department();
	cse.prepare();
}
}
public class Member_inner_class {

	public static void main(String[] args) {
		University jntu=new University();
		jntu.announcement();

	}

}
