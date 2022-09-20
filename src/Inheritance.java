import java.util.Scanner;
class Square{
	int a;

	Scanner sc=new Scanner(System.in);
	void input(){
		System.out.println("enter a value");
		a=sc.nextInt();
		
	}
	void sqr() {
		System.out.println("square="+(a*a));
	}
}
class Addition extends Square{
	int b;
	void accept() {
		System.out.println("enter b value");
		b=sc.nextInt();
		
	}
	void add() {
		System.out.println("sum ="+(a+b));
	}
}

public class Inheritance {
public static void main(String args[]) {
	Addition aa=new Addition();
	aa.input();
	aa.sqr();
	aa.accept();
	aa.add();
	
}
}
