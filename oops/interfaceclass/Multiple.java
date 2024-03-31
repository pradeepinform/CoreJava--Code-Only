package interfaceclass;

public class Multiple implements A,B{

	@Override
	public void show() {
		System.out.println("Interface A ");
		
	}
	
	public static void main(String[] args) {
		Multiple m = new Multiple();
		m.show();
		m.dish();
	}

	@Override
	public void dish() {
		System.out.println("Interface b");
		
	}

}
