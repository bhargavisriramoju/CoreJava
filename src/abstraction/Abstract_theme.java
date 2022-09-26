package abstraction;
abstract class Train{
	 abstract void place() ;
	 abstract void charge();
	 void travel() {
		 System.out.println("happy journey");
		
	 }		
	
}
class Kakathiya extends Train{
	void place() {
		System.out.println("from manuguru to hyderabad");
	}
	void charge () {
		System.out.println("charges 100 rupees per head");
		
	}
}
class  Singareni  extends Train{
	void place(){
		System.out.println("from khothagudem to warangal");
		
	}
	void charge() {
		System.out.println("charges 50 rupees per head");
	}
}

public class Abstract_theme {
	public static void main(String args[]) {
		Train x;
	
		x=(Train)new Kakathiya();
		x.travel();
		x.place();
		x.charge();
	
		x=(Train)new Singareni();
		x.travel();
		x.place();
		x.charge();

}
}
