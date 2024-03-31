package default_constructor;

public class D_Constructor {
	
	/*============================================================================================================
	 * Default Constructor  ====> A Constructor which does not have any parameter is called default constructor.
	 * ===========================================================================================================
	 * 
	 * Syntax
	 * =========
	 *class A 
	 *{
	 *     A()---------------> Default Constructor.
	 *     {
	 *     
	 *     
	 *     
	 *     }
	 *
	 *} 
	 *================================================================ 
	 
	 * */
	
	
	
		int a; String b; boolean c;
		
	
		D_Constructor()
		{
			a=100; b="pradeep"; c=true;
		}
		
		void disp()
		{
			System.out.println(a+" "+b+" "+c );
		}

		public static void main(String[] args) {
			D_Constructor ref = new D_Constructor();
			ref.disp();
		}
}
