package Day7;

public class Tranasactions {
	int available=5000;
	synchronized void withdraw(int amount) {
		System.out.println("Available balance= "+this.available);
		System.out.println("Trying to withdraw... "+amount);
		if(this.available<amount) {
			System.out.println("Less balance;waiting for deposit... ");
			try {
				wait();
				Thread.sleep(3000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.available-=amount;
		System.out.println("Withdraw completed...balance is:  "+this.available);
	}
	synchronized void deposit(int amount) {
		System.out.println("Trying to deposit... "+amount);
		this.available+=amount;
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Deposit completed... balance is: "+this.available);
		notify();
	}

}
