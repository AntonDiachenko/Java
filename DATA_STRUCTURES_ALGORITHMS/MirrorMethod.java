/*
 Write a method mirror that accepts a queue of strings as a parameter and 
 appends the queue's contents to itself in reverse order.
front [a, b, c] back
becomes
front [a, b, c, c, b, a] back
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MirrorMethod {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.add("a");
		q.add("b");
		q.add("c");
		
//		System.out.println(q);
		
		
		Mirror(q);	

  }
	
	// method to reverse and combine the queue
		private static void Mirror(Queue<String> q) {
		Stack<String> s = new Stack<String>();
		Queue<String> temp = new LinkedList<String>();
		
		while (!q.isEmpty()) {
			String myString = q.remove(); 
			s.push(myString);
			temp.add(myString);
		}

		while (!s.isEmpty()) {
			temp.add(s.pop());
		}
		System.out.println(temp);
	}
	
}
