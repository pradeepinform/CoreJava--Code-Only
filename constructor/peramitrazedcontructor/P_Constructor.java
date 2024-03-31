package peramitrazedcontructor;

public class P_Constructor {
	
	/*====================================================================
	 * parametrized constructor ===> A Constructor through which we can pass one or more parameters is called parametrized constructor.
	 * ===================================================================
	 * 
	 * 
	 * 
	 * 
	 * */
	
	int x,y;
	P_Constructor(int a, int b)
	{
		x=a; y=b;
	}
	void show()
	{
		System.out.println(x+ " "+y);
	}
	
	
	public static void main(String[] args) {
		P_Constructor p = new P_Constructor(55,22);
		p.show();
	}

}
