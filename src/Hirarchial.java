import java.util.Scanner;
class Hyderabad{
	int h;
	Scanner sc=new Scanner(System.in);
	void now() {
		System.out.println("poupulation in hyderabad");
		h=sc.nextInt();
	}
	void see() {
		System.out.println("the total population in hyderabad = "+(h));
		
	}
}
	class Car extends Hyderabad{
		int c;
		void go() {
			System.out.println("private transport");
			c=sc.nextInt();
		}
		void run() {
			System.out.println("number of people go by car = "+(h-c));
		}
	}
	
		class Bus extends Hyderabad{
			int b;
			void get() {
				System.out.println("public transport");
				b=sc.nextInt();
			}
			void by() {
				System.out.println("number of people go by bus= "+(h-b));
			}
		
	}
public class Hirarchial {
	public  static void main(String args[]) {
		Car aa=new Car();
		Bus bb=new Bus();
		aa.now();
		aa.see();
		aa.go();
		aa.run();
		bb.now();
		bb.see();
		bb.get();
		bb.by();
		
		
	

	}
}

