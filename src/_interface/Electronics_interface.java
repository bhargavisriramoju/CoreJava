package _interface;
interface Electronics{
	void cost();
	void ram();
	}
abstract class Laptop implements Electronics{
	void keyboard() {
		System.out.println("keyboard is used for typing ");
	}	
	}
	class Dell extends Laptop{
		public void cost() {
			System.out.println("Dell costs 40000");
	}
		public void ram () {
			System.out.println("ram of dell is 8gb");
			}}
	class Lenovo extends Laptop{
		public void cost() {
			System.out.println("Lenovo costs 50000");
		}
		public void ram() {
			System.out.println("it has 4gb ram");
		}}
	abstract class Phone1 implements Electronics{
		public void screen() {
			System.out.println("screen touch is used in phones for typing");
			}}
	class Mi extends Phone1{
		public void cost () {
		System.out.println("Mi costs 20000");
		}
	public void ram() {
		System.out.println("its ram 2gb");
		}}
	class Samsung extends Phone1 {
		public void cost() {
			System.out.println("samsung costs 15000");
		}
		public void ram() {
			System.out.println("its ram is 4gb");
		}}
public class Electronics_interface {
	public static void main(String args[]) {
		Laptop l;
		l=new Dell();
		l.keyboard();
		l.cost();
		l.ram();
		l=new Lenovo();
		l.cost();
		l.ram();
		Phone1 p;
		p=new Mi();
		p.screen();
		p.cost();
		p.ram();
		p=new Samsung();
		p.cost();
		p.ram();
		}}
