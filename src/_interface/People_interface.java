package _interface;
interface Country{
	abstract void name();
	abstract void age();
}
abstract class Person2 implements Country{
	void indian(){
		System.out.println("there are two people from India");
		}}
class Gopi extends Person2{
	public void name() {
		System.out.println("  1.the person name is Gopi");
		
	}
	public void age() {
		System.out.println("  his age is 18");
	}
	}
class Manoj extends Person2{
	public void name() {
		System.out.println("   2.the person name is Manoj");
	}
	public void age() {
		System.out.println("    his age is 20");
	}
}
abstract class Person3 implements Country{
	 void American() {
	System.out.println("there are 2 people from America ");
}
}
	 class Peter extends Person3{
	 public void name() {
		 System.out.println("  1. the person name is peter");
	 }
	 public void age() {
		 System.out.println("   his age is 22");
	 }
	 }
	 class John extends Person3{
		public  void name () {
			 System.out.println("   2.the person name is john");
		 }
		 public void age() {
			 System.out.println("   his age is 25");
		 }
	 }
	 


public class People_interface {
	public static void main(String args[]) {
		 Person2  p;
		p=new Gopi();
		p.indian();
		p.name();
		p.age();
		p=new Manoj();
		p.name();
		p.age();
		Person3 n;
		n=new Peter();
		n.American();
		n.name();
		n.age();
		n=new John();
		n.name();
		n.age();
		
		
	}		

}
