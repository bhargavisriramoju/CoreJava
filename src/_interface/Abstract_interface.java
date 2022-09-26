package _interface;
interface Vehicle{
	void cost();
	void milage();
	
}
abstract class Car121 implements Vehicle{
	void ac() {
		System.out.println("we have ac in the cars");
	}	
	}
	class Maruthi extends Car121{
		public void cost() {
			System.out.println("Maruthi has low cost");
	}
		public void milage () {
			System.out.println("it gives milage around 15km");
			
		}
}
	class Suzukhi extends Car121{
		public void cost() {
			System.out.println("suzukhi costs 500000");
		}
		public void milage() {
			System.out.println("it gives milage around 10km");
		}
	}
	abstract class Bike2 implements Vehicle{
		public void helmet() {
			System.out.println("wear helmet while driving the bike");
			
		}
	}
	class Herohonda extends Bike2{
		public void cost () {
		System.out.println("the HEROHONDA costs 70000");
		}
	public void milage() {
		System.out.println("it's milage is 10km");
		
	}
		
	}
	class Pulsar extends Bike2{
		public void cost() {
			System.out.println("pulsar cost is 100000");
		}
		public void milage() {
			System.out.println("the milage of pulsar is 15km");
		}
		
	}
	
public class Abstract_interface {
	public static void main(String args[]) {
		Car121 c;
		c=new Maruthi();
		c.cost();
		c.milage();
		c=new Suzukhi();
		c.cost();
		c.milage();
		Bike2 b;
		b=new Herohonda();
		b.cost();
		b.milage();
		b=new Pulsar();
		b.cost();
		b.milage();
		
		
	}

}
