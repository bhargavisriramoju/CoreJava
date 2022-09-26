package methodoverriding;
class Phone{
	void cost() {
		System.out.println("no cost");
		
	}
	void ram() {
		System.out.println("no ram");
	}
}
class Vivo extends Phone{
	void cost() {
		System.out.println("vivo cost is 10 thousand");
	}
	void ram() {
		System.out.println("vivo ram is 2gb");
		
	}
}
class Oppo extends Phone{
	void cost(){
		System.out.println("Oppo cost is 15 thousand");
		
	}
	void ram() {
		System.out.println("oppo ram is 4gb");
	}
}
public class Methodoverriding_theme {
	public static void main(String args[]) {
		Phone p=new Phone ();
		p.cost();
		p.ram();
		p=new Vivo();
		p.cost();
		p.ram();
		p= new Oppo();
		p.cost();
		p.ram();
		
	}

}
