package string;

import java.util.Arrays;

public class Teststringcomparison1 {
	public static void main(String[] args) {
		String s1= "pradeep";
		String s2 = "pradeep";
		String s = "PRADEEP";
		
		String s3 = new String("pradeep");
		String s4 = "pradeep";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s4));
		System.out.println(s.equals(s4));
		System.out.println(s.equalsIgnoreCase(s4));
		
		System.out.println(s.compareTo(s2));
		
		String s5 = new String("pradeep");
		String s6 = new String("kumar");
		String s7 = String.format(s6, s5);
		System.out.println(s7.toString());
		
		
			 String s8="SachinTendulkar";    
			 System.out.println("Original String: " + s8);  
			 System.out.println("Substring starting from index 6: " +s8.substring(6));//Tendulkar    
			 System.out.println("Substring starting from index 0 to 6: "+s8.substring(0,6)); //Sachin  

		
		
			 
				        String text= new String("Hello, My name is Sachin");  
			         /* Splits the sentence by the delimeter passed as an argument */  
			 	        String[] sentences = text.split("\\.");  
			 	        System.out.println(Arrays.toString(sentences));  
			 	        
			 	        
			 	        
			 	        
			 	      	System.out.println(s);//  Sachin      
			 	      	String l="                      Sachin 				 ";    
			 	      	System.out.println(l.trim());//Sachin    


	}

}
