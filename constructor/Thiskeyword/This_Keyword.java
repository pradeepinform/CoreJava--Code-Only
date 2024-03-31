package Thiskeyword;


/*===================================================================
 * this keyword
 * ==================================================================
 * this keyword refers to the current object inside a methed or constructor.
 * ========================================================================
 * 
 * 
 * 1) whenever the name of instance and local variables both are same then our 
 * 	  runtime enviroment jvm gets confused that which use is local variable 
 *    & which one is instance variable , to avoid this problem use should use this keyword
 * ========================================================================================
 *    
 *    
 *    EXAMPLE
 * ========================================
 * 
 *       Class A
 *       {
 *       
 *       	int a; instance variable
 *       	A(int a) Local variable (and jvm confusion)
 *       		{
 *       		a=a;       (this.a=a;)
 *       		System.out.println();
 *       		}
 *       
 *       }
 * ==================================================================================
 * 2) it is also used when we want to call the default constructor of its own class.
 * ===================================================================================
 * 
 * 
 * Class A
 * {
 * 
 *        A()
 *        {
 * 
 * 
 * 
 *         }
 * 
 *         A(int a)
 *          {
 *             this();
 *           }
 * 
 * }
 * ==========================================================================
 *  3) it also called parametrized constructor of its own class.
 * =========================================================================
 * Class A
 * {
 *          A()
 *           {
 *             this(10);
 *           }
 * 
 *            A(int a)
 *               {
 *               
 *               
 *               }
 * 
 * }
 * 
 * ===============================================================
 * 
 * 
 * 
 * */

public class This_Keyword {
	void show()
	{
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		
		This_Keyword r = new This_Keyword();
		System.out.println(r);
		r.show();
	}

}
