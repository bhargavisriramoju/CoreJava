class Courier{
	void form() {
		System.out.println("Details name___fromaddress____");
		
	}

		void parcel(String parcelnumber,String address) {
			System.out.println("parcel number= " +parcelnumber+" address= " +address);
	}
		String slip() {
			return "recieved slip";
			
			
		}
		String parcelbill(int amount) {
			System.out.println("amount paid to parcel" +amount);
			return "paid";
		}
}
public class Methodcourier {
	public static void main(String args[]) {
		Courier c=new Courier();
		c.form();
		c.parcel("5463","gowthami nagar 4-121");
		System.out.println("slip status "+c.slip());
		System.out.println("amount "+c.parcelbill(500));
		
		
}

}
