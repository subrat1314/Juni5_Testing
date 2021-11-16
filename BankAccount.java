package juni5Testing;

//import junit.framework.Test;

public class BankAccount {
	
	double accBanlance;
	
	
	
	public BankAccount(double accBanlance) {
		super();
		this.accBanlance = accBanlance;
	}

	
	void withDraw(double withDrawAmt) throws InsufficientFundsException {
		
		if(withDrawAmt>accBanlance)
			throw new InsufficientFundsException("InsufficientFundsException");
		
		accBanlance=accBanlance-withDrawAmt;
		
		System.out.println("Amount WithDrawn: "+withDrawAmt);
		System.out.println("Available Balance: "+accBanlance);
	}
	
	public static void main(String[] args) {
		
		BankAccount acc1=new BankAccount(20000.00);

		try {
			acc1.withDraw(20000.00);
		} catch (InsufficientFundsException e) {
		
			e.printStackTrace();
		}
		
	}

}