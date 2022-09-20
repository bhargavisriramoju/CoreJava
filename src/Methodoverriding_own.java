class People{
	void name() {
		System.out.println("no name");
		
	}
	void height () {
		System.out.println("no height");
	}
}
class Geeta extends People{
	void name() {
		System.out.println("the person name is Geeta");
	}
	void height() {
		System.out.println("Geeta's height is 5 feet");
		
	}
}
class Rahul extends People{
	void name(){
		System.out.println("the person name is Rahul");
		
	}
	void height() {
		System.out.println("Rahul's height is 6 feet");
	}
}
public class Methodoverriding_own {
	public static void main (String args[]) {
		People n=new People();
		n.name();
		n.height();
		n=new Geeta();
		n.name();
		n.height();
		n=new Rahul();
		n.name();
		n.height();
		
		
	}

}
