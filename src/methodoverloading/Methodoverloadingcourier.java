package methodoverloading;
import java.util.Scanner;
class courier122{
	void details(String fromaddress , String toaddress){
		System.out.println(fromaddress+" to "+toaddress);
		
	}
void details(float productcharge, float tax ) {
		System.out.println("total courier charge ="+(productcharge+tax));
	}
}
public class Methodoverloadingcourier {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		courier122 t=new courier122();
		System.out.println("entee the address from -to");
		t.details(sc.next(), sc.next());
		System.out.println("enter two values");
		t.details(sc.nextFloat(),sc.nextFloat());
		
	}		

}
