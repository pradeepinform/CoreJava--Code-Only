package superkey;

/*========================================================================
 * Super Keyword
 * =======================================================================
 * super keyword refers to the objects of super class, it is used when 
 * we want to call the super class variable , method & constructor through
 * sub class object.
 * =======================================================================
 * NOTE
 * =======================================================================
 * 1) Whenever the super class & sub class variable and method name both
 * 	  are same than it can be used only.
 * =======================================================================
 * 2) To avoid the confusion between super class and sub classes variable
 * 	  and methods that have same name we should we super keyword.
 * ======================================================================= 
 * 
 * Super----1>Variable
 * 			2>method
 * 			3>constructor
 * 
 * 
 * 
 * 
 * 
 * */
public class S_Keyword {
	
	int a=20;
} 

class B extends S_Keyword
{
	int a=30;
	void show()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
	
	
}
class Test{
	public static void main(String[] args) {
		B b = new B();
		b.show();
	}
}
