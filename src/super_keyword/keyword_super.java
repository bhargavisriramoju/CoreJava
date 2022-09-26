package super_keyword;
class Parent{
	int age=54;
	
}
class child extends Parent{
	int age=22;
	void details() {
		System.out.println("parent age is "+super.age);
		System.out.println("child age is "+age);
		
	}
}
public class keyword_super {
	public static void main(String args[]) {
		child x=new child();
		x.details();
	}

}
