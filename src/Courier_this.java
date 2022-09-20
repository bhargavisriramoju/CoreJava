class Post {
	int doornumber;
	String name;
	
	Post(int doornumber,String name){
		this.doornumber=doornumber;
		this.name=name;
		
	}
	void show() {
		
		System.out.println("doornumber= "+doornumber);
		System.out.println("name  ="+name);
		
	}
}
public class Courier_this {

	public static void main(String args[]) {
		Post p=new Post(4_131,"neha");
	
		p.show();
		
	}

}

