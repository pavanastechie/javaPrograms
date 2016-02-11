package concurrent;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDequeDemo {

	public static void main(String[] args) {
		BlockingDeque<String> deque = new LinkedBlockingDeque<String>();

		deque.addFirst("1");
		deque.addLast("2");

		try {
			String two = deque.takeLast();
			System.out.println(two);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			String one = deque.takeFirst();
			System.out.println(one);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
