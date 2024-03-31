package inheritance;

public class Pradeep extends Student {
	
	void disp()
	{
		roll=1; 
		name="pradeep";
		marks = 214;
		System.out.println(roll+" "+name+" "+marks);
	}
	
	public static void main(String[] args) {
		Pradeep p = new Pradeep();
		p.input();
		p.disp();
	}

}
