package Day7;


public class WaitNotifyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tranasactions trans=new Tranasactions();
		new Thread() {
			public void run() {
				trans.withdraw(7000);}
			}.start();
			new Thread() {
				public void run() {
					trans.deposit(5000);}
				}.start();	
		}

	}


