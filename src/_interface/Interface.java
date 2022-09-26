package _interface;
interface Mother{
	int age=50;
	

interface Daughter{
	int age=20;
}
}
class Details implements Mother{
	void details() {
		System.out.println("Mother age is= "+Mother.age);
		System.out.println("Daughter age is ="+Daughter.age);
		
	}
	
}
public class Interface {
	public static void main (String args[]) {
		Details d=new Details();
		d.details();
	}

}
