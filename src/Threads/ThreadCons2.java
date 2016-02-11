package Threads;

public class ThreadCons2 extends Thread {

	public static void main(String[] args) {
		Thread myThread1 = new Thread( "threadCons2"){
			public void run() {
				System.out.println(getName()+" is Running...");
			}
		};
		myThread1.start();
	}
	
	
}
