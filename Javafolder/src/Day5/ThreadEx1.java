package Day5;
class Numbers implements Runnable {
		 
		@Override
		public void run() {
		for(int i=1;i<=5;i++)
		System.out.print(i+" ");

		}
		}
		public class ThreadEx1 {
		public static void main(String[] args) {
		Numbers num = new Numbers();
		Thread t1 = new Thread(num);
		Thread t2 = new Thread(num);
		Thread t3 = new Thread(num);
		t1.start();
		t2.start();
		t3.start();
		}
		

	}



		