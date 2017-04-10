package linkedLists;

import java.util.*;

class LinkedListsPractice {
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("2");
		ll.add("1");
		ll.add("3");
		String temp;
		temp = ll.getLast();
		System.out.println(temp);
		temp = ll.getFirst();
		System.out.println(temp);
		temp = ll.get(2);
		System.out.println(temp);

		Collections.sort(ll, Collections.reverseOrder());
		temp = ll.getLast();
		System.out.println(temp);
		//
		// Descendig Iterator
		Iterator it = ll.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// replate element
		ll.set(1, "4");
		System.out.println(ll.get(1));

		//
		System.out.println("Queue Implementation");
		// queue implementation
		Queue<String> q = new LinkedList<String>();
		q.offer("1");
		q.offer("2");
		q.offer("3");
		temp = q.peek();
		System.out.println(temp);
		temp = q.poll();
		temp = q.peek();
		System.out.println(temp);

	}
	//
	// Use Collections.reverseOrder() for reverse sort.
	// Stack - Push - add new element at top
	// - Pull - remove element from top
	// - peek - retrive top element

	// Queue can be implemented as
	// Queue<E> q=new LinkedList<E>()
	// - offer - add element to top
	// - poll - remove element from the head
	// - peek - get element at the head

}