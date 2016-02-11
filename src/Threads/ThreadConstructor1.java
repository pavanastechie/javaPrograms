package Threads;

public class ThreadConstructor1 extends Thread {

	public static void main(String[] args) {
		ThreadConstructor1 myThread = new ThreadConstructor1();
			myThread.start();

	}
	
	 public void run(){
	       System.out.println("MyThread is running");
	    }

}
