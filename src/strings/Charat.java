package strings;


public class Charat {
	public static void main(String args[]) {
		String s="hello";
		
		System.out.println(s);
		String k=s.concat("world");
		System.out.println(s);
		System.out.println(k);
		System.out.println(s.equals("s"));
		System.out.println(s.equalsIgnoreCase("s"));
	
		System.out.println(s.charAt(3));
		System.out.println(s.contains("e"));
		System.out.println(s.substring(2));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		String[] k1=k.split(" ");
		for(String x:k1) {
			System.out.println(x);
		}
	}
	}
