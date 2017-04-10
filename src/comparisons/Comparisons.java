package comparisons;

import java.util.*;

class Student implements Comparable<Student> {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int compareTo(Student s2) {
		return name.compareTo(s2.name);
	}
}

class Student2 {
	int id;
	String name;

	Student2(int id, String name) {
		this.id = id;
		this.name = name;
	}

}

class Comparisons {
	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<Student>();
		//
		al.add(new Student(1, "mano"));
		al.add(new Student(2, "aaa"));
		al.add(new Student(3, "ccc"));
		System.out.println("Before Sort");
		for (Student s : al) {
			System.out.println(s.id);
		}
		Collections.sort(al);
		System.out.println("After Sort");
		for (Student s : al) {
			System.out.println(s.id);
		}
		//
		System.out.println("Implementation using comparator");

		// implementation of Comapartor
		System.out.println("Before Sort");

		ArrayList<Student2> al2 = new ArrayList<Student2>();
		al2.add(new Student2(1, "mano"));
		al2.add(new Student2(2, "aaa"));
		al2.add(new Student2(3, "ccc"));
		for (Student2 s : al2) {
			System.out.println(s.id);
		}

		Collections.sort(al2, new Comparator<Student2>() {
			public int compare(Student2 s1, Student2 s2) {
				return s1.name.compareTo(s2.name);
			}
		});
		System.out.println("After Sort");
		for (Student2 s : al2) {
			System.out.println(s.id);
		}

		Collections.sort(al2, Collections.reverseOrder(new Comparator<Student2>() {
			public int compare(Student2 s1, Student2 s2) {
				return s1.name.compareTo(s2.name);
			}
		}));
		System.out.println("After reverse Sort");
		for (Student2 s : al2) {
			System.out.println(s.id);
		}

	}

	// How to implement compartor? stuck while calling the method
	// is Comparable is interface?

	// Comparable is interface and the type should be same class type
	// class student implements Comparable<Student>
	// parameter in compareTo should be class name Eg. student

	// FOR REVERSE ORDER Collections.sort(list,Collections.reverseOrder(new
	// Comparator....))
}