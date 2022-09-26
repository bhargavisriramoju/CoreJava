package inheritence;
import java.util.Scanner;
class Agreement{
	int m;
	Scanner sc=new Scanner(System.in);
	void call() {
		System.out.println("contract budget is");
		m=sc.nextInt();
	}
	
	
}
class Funds extends Agreement{
	int n;
	void count() {
		System.out.println("funds available are");
		n=sc.nextInt();
	}
	void  subtract() {
		System.out.println("subtract="+(m-n));
	}
	
}
public class Inheritance_contract {
	public static void main(String args[]) {
		Funds t=new Funds();
		t.call();
	
		t.count();
		t.subtract();
	}

}
