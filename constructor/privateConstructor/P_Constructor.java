package privateConstructor;

public class P_Constructor {
	
	/* private constructor
	 * ====================================================================
	 * In java , it is possible to write a constructor as a private but accourding to the rule
	 * we can not access private members outside of class.
	 * =====================================================================
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

	int a; double b; String c;
	private  P_Constructor()
	{
		a=10; b=12.02; c="pradeep";
		System.out.println(a+" "+b+" "+c);
		
	}
	
	public static void main(String[] args) {
		P_Constructor ref = new P_Constructor();
		
	} 
	
}

/*class B
{
	public static void main(String[] args) {
		P_Constructor ref = new P_Constructor();
		
	}
	
}
*/