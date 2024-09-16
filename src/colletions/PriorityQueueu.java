package colletions;

import java.util.PriorityQueue;

public class PriorityQueueu {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue= new PriorityQueue<>();
		queue.add(1);
		queue.add(2);
		queue.add(2);
		System.out.println(queue);
		System.out.println(queue.element());//givies head value
		System.out.println(queue.peek()); //givies head value
		System.out.println(queue);
		System.out.println(queue.poll());//remove head
		System.out.println(queue.remove());// remove head
		System.out.println(queue);
	}
}
