package inheritence;
import java.util.Scanner;
class India{
	int s;
	Scanner sc=new Scanner(System.in);
	 void get() {
		 System.out.println("number of states in India");
		 s=sc.nextInt();
		 
	 }
	 void check(){
		 System.out.println("total states are= "+(s));
	 }
	
}
class Telangana extends India{
	int t;
	void know() {
		System.out.println("number of districts in Telangana");
		t=sc.nextInt();
	}
	void now() {
		System.out.println("total district in india= "+(s+(t*t)));
	}
}
class District extends Telangana{
	int d;
	void let() {
	System.out.println("number of mandals in distrct");
	d=sc.nextInt();
}
	void here() {
		System.out.println("total mandals in india= "+(s+(t*t+(d*d))));
	}
}
public class Multilevel {
public static void main(String args[]) {
	District i=new District();
	i.get();
	i.check();
	i.know();
	i.now();
	i.let();
	i.here();
}

}
