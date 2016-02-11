package concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueDemo {


	    public static void main(String[] args) throws Exception {

	        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);

	        Producer producer = new Producer(queue);
	        Consumer consumer = new Consumer(queue);

	        new Thread(producer).start();
	        new Thread(consumer).start();

	        Thread.sleep(4000);
	    }
	}

class Producer implements Runnable{

    protected BlockingQueue<String> queue = null;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            queue.put("1");
            System.out.println("Added 1");
            Thread.sleep(1000);
            queue.put("2");
            System.out.println("Added 2");
            Thread.sleep(1000);
            queue.put("3");
            System.out.println("Added 3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Consumer implements Runnable{

    protected BlockingQueue<String> queue = null;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            System.out.println("Taking 1 ---> "+queue.take());
            System.out.println("Taking 2 ---> "+queue.take());
            System.out.println("Taking 3 ---> "+queue.take());
            System.out.println(queue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
