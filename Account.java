/**************************************************************************

	Matthew Wright
	Lab # 8


**************************************************************************/
public class Account{
	// Declarations
	private String acctNo;
	private String owner;
	private String balance;
	//Constructors
	public Account(){
		setAcctNo("");
		setOwner("");
		setBalance("");
	}
	public Account(String aN, String o, String b){
		setAcctNo(aN);
		setOwner(o);
		setBalance(b);
	}
	// Methods
	public void setAcctNo(String aN){acctNo = aN;}
	public String getAcctNo(){return acctNo;}
	
	public void setOwner(String owr){owner = owr;}
	public String getOwner(){return owner;}
	
	public void setBalance(String bal){balance = bal;}
	public String getBalance(){return balance;}
	
	public void Display(){
		System.out.println("Account Number= "+getAcctNo());
		System.out.println("Account Owner= "+getOwner());
		System.out.println("Account Balance= "+getBalance());
	}// end Display
	public static void main (String[] args){
		System.out.println("----------------------------------------------------------------------------");
		//empty Constructor
		Account a1;
		a1 = new Account();
		a1.setAcctNo("34094");
		a1.setOwner("Jacob");
		a1.setBalance("777777.00");
		a1.Display();
		//Constructor with parameters
		System.out.println("");
		Account a2;
		a2 = new Account("34095","Matthew","777777.00");
		a2.Display();
		System.out.println("----------------------------------------------------------------------------");
	}// end main
}// end class