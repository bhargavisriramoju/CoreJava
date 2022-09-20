class Car1{
	void cost() {
		System.out.println("no cost");
		
	}
	void milage() {
		System.out.println("no milage");
	}
}
class Audi extends Car1{
	void cost() {
		System.out.println("Audi cost is 50 lakhs");
	}
	void milage() {
		System.out.println("Audi milage is 10km");
		
	}
}
class Bmw extends Car1{
	void cost(){
		System.out.println("Bmw cost is 40lakhs");
		
	}
	void milage() {
		System.out.println("Bmw milage is 15km");
	}
}
public class Methodoverriding {
	public static void main(String args[]) {
		Car1 x=new Car1();
		x.cost();
		x.milage();
		x=new Audi();
		x.cost();
		x.milage();
		x=new Bmw();
		x.cost();
		x.milage();
	}

}
