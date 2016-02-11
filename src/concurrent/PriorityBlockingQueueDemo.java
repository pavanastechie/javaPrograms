package concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue queue   = new PriorityBlockingQueue();

	    //String implements java.lang.Comparable
	    queue.put("Value");

	    String value = (String) queue.take();
	}

}
