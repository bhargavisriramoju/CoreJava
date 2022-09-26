package abstraction;
abstract class Car2{
	 abstract void cost() ;
	 abstract void milage();
	 void start() {
		 System.out.println("starts with a key");
		
	 }		
	
}
class Audi1 extends Car2{
	void cost() {
		System.out.println("Audi cost is 50 lakhs");
	}
	void milage() {
		System.out.println("Audi milage is 10km");
		
	}
}
class Bmw1 extends Car2{
	void cost(){
		System.out.println("Bmw cost is 40lakhs");
		
	}
	void milage() {
		System.out.println("Bmw milage is 15km");
	}
}

public class Abstract {
	public static void main(String args[]) {
		Car2 x;
	
		x=(Car2)new Audi1();
		x.start();
		x.cost();
		x.milage();
	
		x=(Car2)new Bmw1();
		x.start();
		x.cost();
		x.milage();
	
	}

}
