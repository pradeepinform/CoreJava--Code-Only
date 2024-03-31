package LoopingStatement;

public class A {
	
	
	/*
	 * Switch statement ===> switch is a multiple choice decision making 
	 * 						 selection statement , it used when we want 
	 * 						 to select only one case out of multiple.
	 * */
	
	public static void main(String[] args) {
		for(int i=1; i<=10;++i)
		{
			if(i==5)
				//break;
				continue;
			System.out.println(i+" ");
		}
	}

}
