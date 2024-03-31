package abstraction;

/*abstract class
 * =======================================================================
 * it a class contain at last one abstract method called abstract class.
 * =========================================================================
 * we can not create object for abstract class
 * =========================================================================
 * it contains both abstract & non-abstract methods
 * =========================================================================
 * whenever the action is common but implementations are different than we should
 * use abstract method.
 * ================================================================================
 * 
 * 
 * 
 * 
 * 
 * */


abstract class animal
{
	void legs()
	{
		System.out.println("All animals have 4 legs");
	}
	

	abstract  void sound(); 
	abstract void  eat();
	  
	 
}

class Dog extends animal
{

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("Bow Bow.......");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("meat eating...");
		
	}
	
	
	
}

class Cow extends animal
{

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("oooo ooooo");
		
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("Grass eating");
	}
	
}
public class AbstractC {
	
	
	public static void main(String[] args) {
		Dog dog= new Dog();
		Cow cow = new Cow();
		dog.sound();
		dog.eat();
		cow.sound();
		cow.eat();
	}
	

}
