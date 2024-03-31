package abstraction;


/*==========================================================================
 * Abstraction
 * =========================================================================
 * Abstraction is nothing but hinding the essential informatiom and highlight
 * the only set service.
 * 
 * jo service customer ko provide ki jati h 
 * ============================================================================
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

public abstract class Bank {
	
	public String Name="myBank";
	public String IFSC="myBank123   ";
	
	public void bankDetail()
	{
		System.out.println("Bank_Name:"+Name+" "+"Bank_IFSC Code:"+IFSC);
	}
	// password: 1234
	abstract void Deposite();
	abstract void Withdraw();
	abstract void ceckBal();
	
	

}
