package polymorephism;

public class M_O_R {
	
	void draw()
	{
		System.out.println("can not say shape Type");
	}

}

class square extends M_O_R{
	
	
	void draw()
	{
		super.draw();
		System.out.println("square shape");
	}
}