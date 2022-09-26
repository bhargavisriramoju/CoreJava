package nested_classes;
abstract class Car9{
	abstract  void cost();
}


public class Anynomous_class {
	public static void main(String args[]) {
		Car9 c=new Car9() {
			void cost () {
				System.out.println("the cost of audi car is 30 lakhs");
		}
	};
		c.cost();
	}
}
