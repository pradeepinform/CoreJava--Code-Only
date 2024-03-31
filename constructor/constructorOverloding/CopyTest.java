package constructorOverloding;

public class CopyTest {
	
	int a;String b;
	  CopyTest() {
		
		int a=10; String b = "pradeep kumar";
		System.out.println(a+" "+b);
	}
	  
	  CopyTest(CopyTest ref)
	  {
		  a=ref.a;
		  b=ref.b;
		  
		  System.out.println(a+" "+b);
		  
	  }

	
	public static void main(String[] args) {
		CopyTest c = new CopyTest();
		CopyTest c1 = new CopyTest();
		
	}
	
	
}
