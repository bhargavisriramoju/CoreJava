package inheritence;
import java.util.Scanner;
class Order{
	int x;

	Scanner sc=new Scanner(System.in);
	void know(){
		System.out.println("enter the parcel charge");
		x=sc.nextInt();
		
	
	}
}
class Transport extends Order{
	int y;
	void take() {
		System.out.println("enter the transport charge");
		y=sc.nextInt();
		
	}
	void add() {
		System.out.println("sum ="+(x+y));
	}
}
public class Inheritance_courier {
	public static void main(String args[]) {
		Transport t=new Transport();
		t.know();
	
		t.take();
		t.add();
	}

}
