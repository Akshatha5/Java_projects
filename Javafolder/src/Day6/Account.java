package Day6;

public class Account {
	private int acno;
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	private String custName;
	private double balance;
	public Account() {
		
	}
	public Account(int acno, String custName, double balance) {
		super();
		this.acno = acno;
		this.custName = custName;
		this.balance = balance;
	}
	

	

}
