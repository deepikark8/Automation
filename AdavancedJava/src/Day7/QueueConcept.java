package Day7;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueConcept {
	
	public static void main(String[] args) {
		
		
		Queue<String> q = new LinkedList<String>();
		q.add("Apple");
		q.add("Banana");
		q.add("Orange");
		q.add("Coconut");
		
		//System.out.println(q.poll());//It retrieves and removes the head of the queue  
		//System.out.println(q.peek());//It retrieves the head of the queue
		
		
		for(String str: q) {
			System.out.println(str);
		}
		
		int size = q.size();
		for(int i =0; i<size; i++) {
			
			System.out.println(q.poll());
		}
		
		System.out.println(q.peek());
		
	}

}
