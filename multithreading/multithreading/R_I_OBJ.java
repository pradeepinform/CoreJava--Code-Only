package multithreading;

public class R_I_OBJ {
	
	public static void main(String[] args) {
		R_I_A ref = new R_I_A();
		Thread t = new Thread(ref);
		t.start();
	}

}
