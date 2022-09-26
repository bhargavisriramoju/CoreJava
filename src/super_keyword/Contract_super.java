package super_keyword;
class Start_project{
	int date= 3_5_2021;
	
}
class Ends_project extends Start_project{
	int date=26_6_2022;
	void duration() {
		System.out.println(" project given date "+super.date);
		System.out.println("project completion date "+date);
		
	}
}
public class Contract_super {
	public static void main(String args[]) {
		Ends_project s=new Ends_project();
		s.duration ();
	}

}
