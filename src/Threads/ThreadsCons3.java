package Threads;

public class ThreadsCons3 implements Runnable {

	public static void main(String[] args) {
		ThreadsCons3 runnable = new ThreadsCons3();
		   Thread thread = new Thread(runnable, "<Runnable Thread>");
		   Thread t2 = new Thread(runnable);

		   thread.start();
		   System.out.println(thread.getName());
	}

	@Override
	public void run() {
		System.out.println("thread is running..");
		
	}

}
