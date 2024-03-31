package multithreading;

public class A  extends Thread{
	
	public void run()
	{
		for(int i=1; i<=6;i++)
		{
			System.out.println("pradeep");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
