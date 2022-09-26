package variables_topic;

 class Contract {
	int noticenumber;
	String constructionname;
	long budget;

	double fundsavailable;
	 String constructiontype;
	 short labourcost;
	 float sitearea;
	 
 }
 public class Tendernotice{
	 public static void main(String args[]) {
		 
		Contract c=new Contract();
		c.noticenumber=5252;
		c.constructionname="ramki";
		c.budget=500000000l;
		c.fundsavailable=6000000;
		c.constructiontype="apartment";
		c.labourcost=10000;
		c.sitearea=500.25f;
		System.out.println("the npotice number is"+c.noticenumber);
		System.out.println("the construction name is"+c.constructionname);
		System.out.println("the budget is"+c.budget);
		System.out.println("the funds available is"+c.fundsavailable);
		System.out.println("the construction type is"+c.constructiontype);
		System.out.println("the labour cost is"+c.labourcost);
		System.out.println("the site area is"+c.sitearea);
		
		
		
		
		 
	 }
	 
	 
	 
	 
 }
 
 


