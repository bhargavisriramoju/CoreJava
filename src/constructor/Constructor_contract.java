package constructor;
class Tender{
	int contract_budget;
	String contract_type;
	
	Tender(){
		contract_budget=50000000;
		contract_type="Dam construction";
		
	}
	void get() {
		System.out.println("budget for the project is "+contract_budget);
		System.out.println("type of contract is "+contract_type);
		
	}
}
public class Constructor_contract {
	public static void main(String args[]) {
		Tender t=new Tender();
		t.get();
	}

}
