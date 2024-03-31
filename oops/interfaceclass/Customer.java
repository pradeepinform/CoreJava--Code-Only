package interfaceclass;

class Customer implements Vehical
{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("start(): insert key & press start button");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
		System.out.println("stop(): exit key");
		
	}
	
	public static void main(String[] args) {
		Customer c = new Customer();
		c.start();
		c.stop();
		c.Color();
		Vehical.range();
	}
	
}
