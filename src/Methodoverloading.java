import java.util.Scanner;
class Sum{
	void add(int x, int y){
		System.out.println("integer"+(x+y));
		
	}
	void add(float x, float y) {
		System.out.println("decimal"+(x+y));
	}
}
public class Methodoverloading {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Sum s=new Sum();
		System.out.println("enter two values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		s.add(a,b);
		s.add(sc.nextFloat(),sc.nextFloat());
		
		
		
		
		
		
		
		
		
		
		
	}

}
