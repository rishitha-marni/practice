package colletions;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueInterface {
   public static void main(String[] args) {
	   Deque<Integer> dequeue=new ArrayDeque<>();
	   dequeue.add(1);
	   dequeue.add(2);
	   dequeue.add(3);
	   dequeue.add(4);
	   System.out.println(dequeue);
	  dequeue.addFirst(0);
	  dequeue.addLast(5);
	  dequeue.offer(6);
	  dequeue.offerFirst(-1);
	  dequeue.offerLast(7);  
	  System.out.println(dequeue);
	  dequeue.poll(); //remove from first
	  dequeue.pollFirst();
	  dequeue.pollLast();
	  System.out.println(dequeue);
	  dequeue.pop(); //remove from first
	  System.out.println(dequeue);
	  
	  dequeue.push(10);
	  System.out.println(dequeue);
   }
}
