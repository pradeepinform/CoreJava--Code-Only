package constructorOverloding;

public class A {
	
	
	A(int a,int b)
	{
		System.out.println(a+b);
		
	}
	
	
	A(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		A a = new A(4, 5);
		A a2 = new A(44, 14, 12);
		//System.out.println(a);
	}
}
