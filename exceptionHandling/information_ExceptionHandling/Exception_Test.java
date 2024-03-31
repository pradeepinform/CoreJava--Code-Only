package information_ExceptionHandling;

public class Exception_Test {
	
	/*main method started
	Exception in thread "main" java.lang.ArithmeticException: / by zero
		at information_ExceptionHandling.Exception_Test.main(Exception_Test.java:9)
   */
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		int a=10,b=0,c;
		
		try {
			c=a/b;
			System.out.println(c);
			
		} catch (Exception e) {
			System.out.println(e);
		} 
		
		System.out.println("main method started");
	}

}
