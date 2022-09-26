package this_keyword;
class Notice {
	int notice_number;
	long budget;
	
	Notice(int notice_number,long budget){
		this.notice_number=notice_number;
		this.budget=budget;
		
	}
	void visit() {
		
		System.out.println("notice number is "+notice_number);
		System.out.println("budget available "+budget);
		
	}
}
public class Contract_this {



public static void main(String args[]) {
	Notice n=new Notice(5555,1000000);
	n.visit();
	
}
}