package hashSet;

import java.util.*;

class HashSetPractice {
	public static void main(String args[]) {
		HashSet<String> set = new HashSet<String>();
		set.add("1");
		set.add("2");
		set.add("1");
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Linked HashSet which maintains insertion order");
		LinkedHashSet<String> lset = new LinkedHashSet<String>();
		lset.add("3");
		lset.add("1");
		lset.add("2");
		lset.add("1");
		it = lset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Tree HashSet which stores in sorting order");

		TreeSet<String> tset = new TreeSet<String>(lset);
		it = tset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Tree HashSet which stores in sorting order with comapartor");

		TreeSet<String> tcset = new TreeSet<String>(new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
		tcset.add("2");
		tcset.add("1");
		it = tcset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}