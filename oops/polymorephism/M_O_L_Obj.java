package polymorephism;

public class M_O_L_Obj {
	public static void main(String[] args) {
		M_O_L m = new M_O_L();
		m.add();
		m.add(45, 44.55);
		m.add(47, 41);
		String s = m.add("");
		System.out.println(s.replace("e", ""));
		
		square r = new square();
		r.draw();
		
		
	}

}
 