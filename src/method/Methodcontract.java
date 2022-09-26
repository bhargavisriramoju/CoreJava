package method;
class Contract{
	void tendernotice() {
		System.out.println("Details site___projecttype____");
		
	}

		void certificates(String id,String workexperience) {
			System.out.println("contractor id=" +id+ "workexperience=" +workexperience);
	}
		String contractoffered() {
			return "contract document";
			
			
		}
		String budget(int amount) {
			System.out.println("amount "+amount);
			return "issued";
		}
}
public class Methodcontract {
	public static void main(String args[]) {
		Contract p=new Contract();
		p.tendernotice();
		p.certificates("225",":5 years");
		System.out.println("offering of "+p.contractoffered());
		System.out.println("amount " +p.budget(300000));
		
	}
}
