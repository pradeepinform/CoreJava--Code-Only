package interfaceclass;

import java.awt.Color;

/*Interface
 * =========================================
 * Interface just like, a class , which contains only abstract method.
 * To achieve interface in java by the help of implements interface keyword.
 * ===========================================================================
 * 
 * NOTE
 * ==========================================================================
 * By default variable are public + static + final inside a interface.
 * ============================================================================
 * By default methods are public and abstract.
 * ===================================================================
 * from jdk 1.8 donward interface can have default & static methods
 * ==================================================================  
 * 
 * 
 * 
 * */

public interface Vehical {
	
	String name="TVS"; //public + static + final
	int Speed= 100; //public + static + final
	
	void start(); //public + abstract
	void stop();   //public + abstract
	default void Color()
	{
		System.out.println("Black");
	}
	
	static void range()
	{
		System.out.println("TVS is range 570000");
	}

}


