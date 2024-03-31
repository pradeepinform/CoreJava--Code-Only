package string;

public class RT {
	
	public static void main(String[] args) {
		
		String name="hello my name is pradeep kumar";
		int ch = name.length();
		String rev ="";
		for(int i=ch-1; i>=0; i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		

	}

}
