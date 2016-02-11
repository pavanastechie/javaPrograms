import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String [] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.offer("b");
		pq.offer("c");
		pq.offer("a");
		pq.offer("d");
		pq.offer("f");
		pq.offer("e");
		System.out.println(pq);
		System.out.println("return head of queue "+pq.peek()); //return null if empty
		System.out.println("return head of queue "+pq.element()); //return exception, if empty
		System.out.println("return head of queue and remove that "+pq.poll()); 
		System.out.println(pq);
		System.out.println(pq.remove()); //return exception, if empty
		System.out.println(pq);
	}
}
