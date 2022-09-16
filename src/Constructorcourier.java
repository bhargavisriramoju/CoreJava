class Giftpack{
	int productcharge ;
	String address;
	
	Giftpack(){
		productcharge=350;
		address="warangal";
		
	}
	void display() {
		System.out.println("product charged is "+productcharge);
		System.out.println(" delivered to the address "+address);
		
	}
}
public class Constructorcourier {
	public static void main(String args[]) {
		Giftpack c=new Giftpack();
		c.display();
	}

}
