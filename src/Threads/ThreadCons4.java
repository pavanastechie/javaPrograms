package Threads;

public class ThreadCons4 implements Runnable {

	public static void main(String[] args){
		ThreadCons4 r = new ThreadCons4();
		Thread tr = new Thread(r,"<Custom runnable Thread>");
		tr.start();
		 System.out.println(tr.getName());
	}
	@Override
	public void run() {
		System.out.println("thread is Running...");
		
	}

}
