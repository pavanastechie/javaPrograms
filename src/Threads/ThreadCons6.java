package Threads;

public class ThreadCons6 {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("New Tg");
		 Thread t1 = new Thread (tg, "thread 1"){
			 public void run() {
				 System.out.println(Thread.currentThread());
			 }
		 };
		 t1.start();
		

	}

}
