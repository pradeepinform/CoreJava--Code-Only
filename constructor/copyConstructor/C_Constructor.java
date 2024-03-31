package copyConstructor;

public class C_Constructor {
	
	
	/*=======================================================================
	 * Copy Constructor ===> whenever we pass object reference to the constructor then it is called copy constructor.
	 * ======================================================================
	 * 
	 * Syntax
	 * ================================================
	 * 
	 * class class-name{
	 * 
	 * 		class-name(obj ref)
	 * 				{
	 * 				
	 * 				}
	 * }
	 * =================================================
	 * */

	
	int a; String b;
	C_Constructor()
	{
		a=10; b="pradeep kumar";
		System.out.println(a+" "+b);
	}
	
	C_Constructor(C_Constructor ref)
	
	{
		a=ref.a;
		b=ref.b;
		
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
		C_Constructor r = new C_Constructor();
		C_Constructor r2 = new C_Constructor(r);
		
	}
	
}
