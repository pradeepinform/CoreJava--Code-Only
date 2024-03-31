package instanceAndStaticBlock;

public class A {
	
	
	A()
	{
		System.out.println("Default constructor");
	}
	
	{ // instance
		System.out.println("pradeep");
	}
	
	static   //static block
	{
		System.out.println("kumar");
	}
	public static void main(String[] args) {
		A a = new A();
	}

}
