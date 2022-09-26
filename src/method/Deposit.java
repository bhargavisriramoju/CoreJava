package method;
class Bank{
	void form() {
		System.out.println("Details age___name____");
		
	}

		void proof(String id,String address) {
			System.out.println("id"+id+"address"+address);
	}
		String passBook() {
			return "passbook";
			
			
		}
		String deposit(int amount) {
			System.out.println("amount deposited"+amount);
			return "deposited";
		}
}
public class Deposit {
	public static void main(String args[]) {
		Bank sbi=new Bank();
		sbi.form();
		sbi.proof("pan:abj54637h","adhaar:75839747687");
		System.out.println("bank given"+sbi.passBook());
		System.out.println("amount "+sbi.deposit(345));
		
		
		
		
				
	
	}

}
