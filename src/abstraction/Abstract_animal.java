package abstraction;
abstract class Animal{
	 abstract void lifespan() ;
	 abstract void breathe();
	 void wildlife() {
		 System.out.println("research on animals");
	}		
	}
class Tiger extends Animal{
	void lifespan() {
		System.out.println("tiger lives more than 50 years");
	}
	void breathe() {
		System.out.println("it breathes faster ");
		}
	}
class Lion extends Animal{
	void lifespan(){
		System.out.println("it lives more than 100 years");
		}
	void breathe() {
	System.out.println("it has a high breathe rate");
	}
}
public class Abstract_animal {
	public static void main(String args[]) {
		Animal A;
	
		A=(Animal)new Tiger();
		A.wildlife();
		A.lifespan();
		A.breathe();
	
		A=(Animal)new Lion();
		A.wildlife();
		A.lifespan();
		A.breathe();
	
	}
	

}
