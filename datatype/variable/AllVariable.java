package variable;

public class AllVariable {
	
	/*
	 Variable - Variable is the name of memory location where we stored different type of
	 value.
	 Type of Variable
	 1-Local Variable
	 2-Instance Variable
	 3-Static Variable
	 4-final Variable
	  
	  */
	
	int a=10;//Instance
	static double d=22.00;//Static
	
	public static void main(String[] args) {
		
		boolean b=true; //Local Variable
		AllVariable	s=new AllVariable();
		
		System.out.println(d);
		System.out.println(s.a);
		System.out.println(b);
		
	}

}
