package inheritance;

/*=================================
 * Inheritance
 * =================================
 * when we construct a new class from existing class in such a way that the new
 * class access all the called inheritance .
 * ==============================================================================
 * Note
 * ==========================================================
 * In, java extends kelword is used to perform inhertance.
 * ============================================================
 * it provides code reusablity.
 * =============================================================
 *  we can not access private member of class through inheritance.
 *==============================================================
 *A sub class contains all the features of super class so,
 *we should create the object of sub class.
 *=================================================================
 *Method oberiding only possible through inheritance.
 *==================================================================
 *
 *Syntax
 *====================
 *class A  (Super Class)
 *	{
 *	code
 *	}
 *class B extends A (Sub class)
 *		{
 *	code
 *		}
 * =========================================================================
 * 
 * ---------------------------Type of Inheritace--------------------------
 * 1) Single / simple Inheritance
 * ===============================
 * Simple inheritance nothing but which contain only one syper class and only
 * one sub class is called simple inheritance.
 * 
 * Syntax
 * Class super
 * 		{
 *       CODE 
 * 		}
 * class sub extends super
 * 			{
 * 
 * 			CODE
 * 			}
 * ==============================================================================
 * 2) Multi-level Inheritance
 * ===============================
 * In multilevel inheritance we have only one super class and multiple sub
 * classes called multi-level inheritance.
 * =========================================================================
 * Syntax
 * ===============
 * Class super
 * 		{
 * 			//code
 * 		}
 * class sub1 extends super
 * 			{
 * 				//code
 * 			}
 * class sub2 extends sub1
 * 			{
 * 
 * 				//code
 * 			}
 * ========================================================================
 * 3) Multiple Inhertance (Not suport in java)
 * ===========================================
 * we can achieve multiple inheritance through interface because interface
 * contains only abstract method,which implementation is provided by the sub classes.
 *  
 * ===========================================
 * 
 * 4) Hierachical Inheritance
 * =====================================
 * A inheritance which contain only one super class and multiple sub class
 * and all sub class directly extands super class called hierarchical inheritance.
 * 
 * =====================================
 * 5) 
 * 
 * 
 * 
 * 
 * */

public class Student {
	
  int roll,marks;
  String name;
  
  void input()
  {
	  System.out.println("Enter roll name & marks:");
  }
	
}
