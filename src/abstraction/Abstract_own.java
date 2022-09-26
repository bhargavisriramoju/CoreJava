package abstraction;
abstract class Newspaper{
	 abstract void cost() ;
	 abstract void language();
	 void read() {
		 System.out.println("read the newspaper daily");
		
	 }		
	
}
class Times_of_India extends Newspaper{
	void cost() {
		System.out.println("each Times of India newspaper costs 5 rupees");
	}
	void language() {
		System.out.println("the Times of India newspaper is published in English");
		
	}
}
class Sakshi extends Newspaper{
	void cost(){
		System.out.println("each Sakshi newspaper costs 3 rupees");
		
	}
	void language() {
		System.out.println("the sakshi newspaper is published in Telugu");
	}
}
public class Abstract_own {
	public static void main(String args[]) {
		Newspaper x;
	
		x=(Newspaper)new Times_of_India();
		x.read();
		x.cost();
		x.language();
	
		x=(Newspaper)new Sakshi();
		x.read();
		x.cost();
		x.language();
	
	}

}
