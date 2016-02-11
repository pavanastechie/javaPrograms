package Threads;

public class ThreadCons5 implements Runnable {
	public static void main(String[] args){
		ThreadGroup r = new ThreadGroup("Parent");
		Thread t1 = new Thread(r,"Thread1");
		ThreadCons5 tc = new ThreadCons5();
		Thread t2 = new Thread(r, tc);
		Thread t3 = new Thread(r, tc, "Custom Thread");
		Thread t4 = new Thread(r, tc, "Custom Thread",122);// stacksize
		t2.start();
		System.out.println("Thread Group Name is "+r.getName());
		System.out.println("Thread Name "+t3.getName());
	}

	@Override
	public void run() {
		System.out.println("Thread is running...");
		
	}

}
