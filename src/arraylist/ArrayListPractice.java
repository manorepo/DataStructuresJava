package arraylist;

import java.util.*;

class ArrayListPractice {
	public static void main(String args[]) {
		ArrayList<String> aL = new ArrayList<String>();
		//
		// add
		aL.add("mano");
		aL.add("hello");
		aL.add("test");
		//
		// get
		System.out.println("Get first element : " + aL.get(0));

		// Iterator
		System.out.println("--Iterator-- ");
		Iterator it = aL.iterator();
		while (it.hasNext()) {
			String temp = (String) it.next();
			System.out.println(temp);
		}
		System.out.println("---------- ");
		// List Iterator - reverse direction
		System.out.println("--- List Reverse Iterator --- ");
		ListIterator itl = aL.listIterator(aL.size());
		while (itl.hasPrevious()) {
			String temp = (String) itl.previous();
			System.out.println(temp);
		}
		System.out.println("---------- ");

		// remove, we can remove by object
		System.out.println("remove entry 'mano'");
		aL.remove("mano");

		System.out.println("--Iterator after removal-- ");
		it = aL.iterator();
		while (it.hasNext()) {
			String temp = (String) it.next();
			System.out.println(temp);
		}
		System.out.println("---------- ");
		// contains
		System.out.println("Contains - 'hello' ? " + aL.contains("hello"));

		// indexOf
		System.out.println("Index of 'test': " + aL.indexOf("test"));

	}
}