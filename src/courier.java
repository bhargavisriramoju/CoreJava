class Fromaddress{
	int numberofproducts;
	String name;
	static String district;
	
	
}
class toaddress{
	int doornumber;
	String name;
	float weightofproduct;
	
}

public class courier {
	public static void main(String args[]) {
		Fromaddress obj=new Fromaddress();
		obj.numberofproducts=2;
		obj.name="kavya";
		obj.district="khammam";
		System.out.println("the number of products"+obj.numberofproducts);
		System.out.println("the name is"+obj.name);
		System.out.println("the district is"+obj.district);
		
	
	toaddress obj1=new toaddress();
	obj1.doornumber=120;
	obj1.name="geetha";
	obj1.weightofproduct=12.3f;
	
	System.out.println("the door number is"+obj1.doornumber);
	System.out.println("the name is"+obj1.name);
	System.out.println("the weight of products"+obj1.weightofproduct);
	
		
		
		
		
		
	}
	

}
