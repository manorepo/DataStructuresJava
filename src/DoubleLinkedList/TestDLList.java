package DoubleLinkedList;

import java.util.*;

class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class TestDLList {
	public static void main(String args[]) {
		DoubleLinkedList<Student> dl = new DoubleLinkedList<Student>();
		Student s1 = new Student(1, "A");
		Student s2 = new Student(2, "B");
		Student s3 = new Student(3, "C");
		Student s4 = new Student(4, "D");
		Student s5 = new Student(5, "E");

		dl.addLast(s3);
		dl.addFirst(s2);
		dl.addFirst(s1);
		dl.addLast(s5);
		// 1, 2, 3, 5
		dl.insertAt(4, s4);
		// 1, 2, 3, 4, 5
		// System.out.println("Count "+c.count());
		System.out.println("remove First: Id " + dl.removeFirst().id);
		System.out.println("remove Last: Id " + dl.removeLast().id);
		System.out.println("remove First: Id " + dl.removeFirst().id);
		System.out.println("remove Last: Id " + dl.removeLast().id);

		// 1, 5, 2, 4
		// System.out.println("Count "+c.count());
	}
}