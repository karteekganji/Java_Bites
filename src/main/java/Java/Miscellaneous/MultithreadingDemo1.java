package Java.Miscellaneous;

public class MultithreadingDemo1 extends Thread {

	// Method 1: Thread creation by extending Thread class

	public void run() {
		System.out.println("My thread is in running state.");
	}

	public static void main(String args[]) {
		MultithreadingDemo1 obj = new MultithreadingDemo1();
		Thread tobj = new Thread(obj);
		tobj.start();
	}

	public static class Count extends Thread {
		Count() {
			super("my extending thread");
			System.out.println("my thread created" + this);
			start();
		}

		public void run() {
			try {
				for (int i = 0; i < 10; i++) {
					System.out.println("Printing the count " + i);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				System.out.println("my thread interrupted");
			}
			System.out.println("My thread run is over");
		}

		public static class ExtendingExample {
			public static void main(String args[]) {
				Count cnt = new Count();
				try {
					while (cnt.isAlive()) {
						System.out.println("Main thread will be alive till the child thread is live");
						Thread.sleep(1500);
					}
				} catch (InterruptedException e) {
					System.out.println("Main thread interrupted");
				}
				System.out.println("Main thread's run is over");
			}
		}
	}

	// Method 2: Thread creation by implementing Runnable Interface

	public static class MultithreadingDemo2 implements Runnable {
		public void run() {
			System.out.println("My thread is in running state.");
		}

		public static void main(String args[]) {
			MultithreadingDemo2 obj = new MultithreadingDemo2();
			Thread tobj = new Thread(obj);
			tobj.start();
		}
	}
}