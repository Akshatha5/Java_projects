package Day7;
import java.util.Scanner;
public class Reservation implements Runnable {
	private int available =30;
	private int required;
	Scanner sc=new Scanner(System.in);
	@Override
	public synchronized void run() {
		System.out.println("Welcome to "+Thread.currentThread().getName());
		System.out.println("Available births are: "+available);
		if(available>0) {
			System.out.println("Enter required births");
			required=sc.nextInt();
			if(required<=available) {
				System.out.println("births allotted to "+Thread.currentThread().getName());
				available -= required;
			}
			else {
				System.out.println("births not available...");
			}
		}
		else {
			System.out.println("Sorry, births not available...");
		}
	}
}
