package constuctor;

public class C_Constructor {
	
	/*
	 * 
	 * Constuctor ====> constructor is a special type of method whose name is same as class name.
	 * ==========================================================================================
	 * 
	 * 
	 * 
	 * NOTE  
	 * 1) The main purpose of constutor is initilize the object.
	 * 2) every java class has a constuctor.
	 * 3)  A constructor is autometically called at the time of object creation.
	 * 4) A constructor never contain any return-type including void.
	 * 
	 * 
	 * 
	 * =======================================================================
	 * -----------------------Type of Constuctor---------------------------
	 * 1) private
	 * 2) default
	 * 3) parametrized
	 * 4) copy
	 * =========================================================================
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

	int a; String name;
	C_Constructor()
	{
		a=0; name=null;
	}
	
	void show()
	{
		System.out.println(a+" "+name);
	}
	
	
	
	public static void main(String[] args) {
		C_Constructor ref = new C_Constructor();
		ref.show();
	}
	
}


