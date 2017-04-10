package Trees.BST;

import java.util.*;

class Student {
	int id;
	Student left;
	Student right;
	String name;
	int level;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
		this.left = null;
		this.right = null;
	}
}

class BST {

	Student root = null;

	public void addStudentNode(int id, String name) {
		Student curr = root;
		if (root == null) {
			Student newStudent = new Student(id, name);
			root = newStudent;
		} else {

			while (true) {
				if (id < curr.id) {
					if (curr.left != null)
						curr = curr.left;
					else
						break;
				} else if (id > curr.id) {
					if (curr.right != null)
						curr = curr.right;
					else
						break;
				}
			}
			if (id < curr.id) {
				Student newStudent = new Student(id, name);
				curr.left = newStudent;
			} else if (id > curr.id) {
				Student newStudent = new Student(id, name);
				curr.right = newStudent;
			}
		}

	}

	public void inOrder() {
		System.out.println("Inorder");
		System.out.println("*********");
		printinOrder(root);
	}

	public void printinOrder(Student curr) {
		if (curr != null) {
			printinOrder(curr.left);
			System.out.println(curr.id + ":" + curr.name);
			printinOrder(curr.right);
		}
	}

	public boolean search(int key) {
		Student curr = root;
		while (curr != null) {
			if (curr.id == key) {
				return true;
			}
			if (key < curr.id) {
				curr = curr.left;
			} else if (key > curr.id) {
				curr = curr.right;
			}

		}
		return false;
	}

	public void BFS() {
		System.out.println("Level Order Tree Traversal");
		System.out.println("*********");
		if (root == null) {
			System.out.println("Empty tree");
		} else {
			root.level = 1;
			Queue<Student> keeptrack = new LinkedList<Student>();
			keeptrack.add(root);
			while (!keeptrack.isEmpty()) {
				Student currentNode = keeptrack.remove();
				System.out.println("level " + currentNode.level + " : " + currentNode.id);
				if (currentNode.left != null) {
					currentNode.left.level = currentNode.level + 1;
					keeptrack.add(currentNode.left);
				}
				if (currentNode.right != null) {
					currentNode.right.level = currentNode.level + 1;
					keeptrack.add(currentNode.right);
				}

			}
		}
	}

	public void leftView() {
		int LeftviewlevelToPrint;
		System.out.println("Left View");
		System.out.println("*********");
		if (root == null) {
			System.out.println("Empty tree");
		} else {
			root.level = 1;
			LeftviewlevelToPrint = 1;
			Queue<Student> keeptrack = new LinkedList<Student>();
			keeptrack.add(root);
			while (!keeptrack.isEmpty()) {
				Student currentNode = keeptrack.remove();
				if (currentNode.level == LeftviewlevelToPrint) {
					System.out.println("LeftView - level " + currentNode.level + " : " + currentNode.id);
					LeftviewlevelToPrint++;
				}
				if (currentNode.left != null) {
					currentNode.left.level = currentNode.level + 1;
					keeptrack.add(currentNode.left);
				}
				if (currentNode.right != null) {
					currentNode.right.level = currentNode.level + 1;
					keeptrack.add(currentNode.right);
				}

			}
		}
	}

	public static void main(String args[]) {
		BST b = new BST();
		int id = 0;
		String name;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the id (-1 to end):");
			id = sc.nextInt();
			if (id == -1) {
				break;
			}
			System.out.println("Enter the name:");
			name = sc.next();
			b.addStudentNode(id, name);
		}

		b.inOrder();
		System.out.println("Search 3 :" + b.search(3));
		System.out.println("Search 9 :" + b.search(9));
		System.out.println("Search 7 :" + b.search(7));
		System.out.println("Search 6 :" + b.search(6));
		System.out.println("Search 1 :" + b.search(1));
		b.BFS();
		b.leftView();
	}
}