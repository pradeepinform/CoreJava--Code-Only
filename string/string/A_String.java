package string;

public class A_String {
	
	/*
	 * 
	 * String  ===>  String is a pre-defined class in java but we can also
	 * 				 use as a datatype.
	 * 				
	 * NOTE ==>		 String are the sequence of characters and its index starts
	 * 				 from 0 .
	 * 
	 * ---------------------------------------------------------------------------
	 * 
	 * Syntax
	 * -------------------------------
	 * Two Type of object in string 
	 * -------------------------------
	 * 1) String str = new String("pradeep kumar");
	 * 
	 * 2) String str ="pradeep";
	 * 
	 * --------------------------------------
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		String str = "pradeep";
		String str1 = "pradeep";
		String str2 = new String("pradeep");
		String str3 = new String("pradeep");
		int l=str.length();
		System.out.println(l);
		System.out.println(str2.toUpperCase());
		
		if(str2==str3)
		{
			System.out.println("Both are Equals");
		}
		else {
			System.out.println("Not Equals");
		}
		
		
	}
}
