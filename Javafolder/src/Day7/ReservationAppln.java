package Day7;
public class ReservationAppln {
	public static void main(String[] args) {
		Reservation births=new Reservation();
		Thread t1=new Thread(births);
		Thread t2=new Thread(births);
		Thread t3=new Thread(births);
		Thread t4=new Thread(births);
		t1.setName("Akshatha");
		t2.setName("Anjali");
		t3.setName("Lasya");
		t4.setName("Sri");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
