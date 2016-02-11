package concurrent;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

class Producer1 implements Runnable {
	  private String name;

	  private BlockingDeque<Integer> deque;

	  public Producer1(String name, BlockingDeque<Integer> deque) {
	    this.name = name;
	    this.deque = deque;
	  }

	  public synchronized void run() {

	    for (int i = 0; i < 10; i++) {
	      try {
	        deque.putFirst(i);
	        System.out.println(name + " puts " + i);
	        Thread.sleep(300);

	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    }

	  }
	}

	class Consumer1 implements Runnable {
	  private String name;

	  private BlockingDeque<Integer> deque;

	  public Consumer1(String name, BlockingDeque<Integer> deque) {
	    this.name = name;
	    this.deque = deque;
	  }

	  public synchronized void run() {
	    for (int i = 0; i < 10; i++) {
	      try {
	        int j = deque.takeLast();
	        System.out.println(name + " takes " + j);
	        Thread.sleep(3000);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    }
	  }
	}

	public class BlockingDequeDemo {
	  public static void main(String[] args) {
	    BlockingDeque<Integer> deque = new LinkedBlockingDeque<Integer>(5);
	    Runnable producer = new Producer1("Producer", deque);
	    Runnable consumer = new Consumer1("Consumer", deque);
	    new Thread(producer).start();
	    try {
	      Thread.sleep(500);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }

	    new Thread(consumer).start();
	  }
	}