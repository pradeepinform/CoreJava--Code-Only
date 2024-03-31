package claass;

public class A_Cllass {
	
	/*
	 * class  ====> class is a group of elements having common properties and behaviours
	 * 
	 * ----------------------------------------------------------------------------------
	 * Note
	 * 1) class is virtual
	 * 2) object is real 
	 * 
	 * ----------------------------Class of Type--------------------------
	 * pre-define
	 * 1) System
	 * 2) String 
	 * 3) Scanner
	 * 
	 * 
	 * 
	 * */

	
		int age=22;
		String color="white";
		int weight = 56;
		
		void eat()
		{
			System.out.println("I am Eating");
		}
		
		void sleep()
		{
			System.out.println("I am sleeping");
		}
		public static void main(String[] args) {
			
			A_Cllass p = new A_Cllass();
			System.out.println(p.age);
			System.out.println(p.color);
			System.out.println(p.weight);
			p.sleep();
			p.eat();
	}
}
