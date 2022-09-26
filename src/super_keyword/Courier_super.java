package super_keyword;
class Gift{
	int price= 33;
	
}
class Tax extends Gift{
	int price=5;
	void pricedetails() {
		System.out.println(" Courier price is "+super.price);
		System.out.println("tax charges are "+price);
		
	}
}
public class Courier_super {
	public static void main(String args[]) {
		Tax t=new Tax();
		t.pricedetails();
	}

}
