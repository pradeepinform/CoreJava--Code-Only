package lambda;

public class Test implements Mytern{

	@Override
	public void myShow() {
		// TODO Auto-generated method stub
		System.out.println("Hello Lambda Start........");
		
	}
	
	public static void main(String[] args) {
		//Test i = () -> 
		
		Mytern i =() ->
		System.out.println("Hello");
		i.myShow();
	}

}
