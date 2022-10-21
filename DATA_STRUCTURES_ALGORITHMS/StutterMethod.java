/*
 Write a method stutter that accepts a queue of integers as a parameter and replaces 
 every element of the queue with two copies of that element.
front [1, 2, 3] back
becomes
front [1, 1, 2, 2, 3, 3] back
 */


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stutter {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		
		Stutter(q);	
  }
	
		// stutter method
		private static void Stutter(Queue<Integer> q) {
			Queue<Integer> temp = new LinkedList<Integer>();
			
			while (!q.isEmpty()) {
				int myInt = q.remove(); 
				temp.add(myInt);
				temp.add(myInt);
			}
			System.out.println(temp);
		}
		
		
}
