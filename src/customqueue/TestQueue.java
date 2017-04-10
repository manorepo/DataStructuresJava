package customqueue;

import java.util.*;

class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class TestQueue {
	public static void main(String args[]) {
		CustomQueue<Student> c = new CustomQueue<Student>();
		Student s1 = new Student(1, "A");
		Student s2 = new Student(2, "B");
		Student s3 = new Student(3, "C");
		Student s4 = new Student(4, "D");
		c.enqueue(s1);
		c.enqueue(s2);
		c.enqueue(s3);
		c.enqueue(s4);
		System.out.println("Count " + c.count());
		System.out.println("dequeue: Id " + c.dequeue().id);
		System.out.println("dequeue: Id " + c.dequeue().id);
		System.out.println("dequeue: Id " + c.dequeue().id);
		System.out.println("Count " + c.count());
	}
}