package Trees.BinaryTree;

import java.util.*;

class Node<T> {
	T item;
	Node<T> left;
	Node<T> right;
	Node<T> parent;

	Node(T newItem) {
		this.item = newItem;
		this.left = null;
		this.right = null;
		this.parent = null;
	}
}

class BinaryTree<T> implements BinaryTreeInterface<T> {
	Node<T> root = null;
	Queue<Node<T>> queueList = new LinkedList<Node<T>>();

	public boolean addNode(T newItem) {
		if (root == null) {
			Node<T> newNode = new Node<T>(newItem);
			root = newNode;
			queueList.add(newNode);
			return true;
		} else {
			Node<T> currentNode = queueList.peek();
			if (currentNode.left == null) {
				Node<T> newNode = new Node<T>(newItem);
				queueList.add(newNode);
				currentNode.left = newNode;
				return true;
			} else if (currentNode.right == null) {
				Node<T> newNode = new Node<T>(newItem);
				;
				queueList.add(newNode);
				currentNode.right = newNode;
				Node<T> removenodeFromQueue = queueList.remove();
				return true;
			}
			return false;
		}

	}

	public void inOrder() {
		Node<T> curr = root;
		System.out.println("\nIn-Order");
		System.out.println("*********");
		printInOrder(curr);
		System.out.println("\n*********");
	}

	public void printInOrder(Node<T> curr) {
		if (curr != null) {
			printInOrder(curr.left);
			System.out.print(curr.item + "  ");
			printInOrder(curr.right);

		}
	}

	public void preOrder() {
		Node<T> curr = root;
		System.out.println("\npre-Order");
		System.out.println("*********");
		printPreOrder(curr);
		System.out.println("\n*********");
	}

	public void printPreOrder(Node<T> curr) {
		if (curr != null) {
			System.out.print(curr.item + "  ");
			printPreOrder(curr.left);
			printPreOrder(curr.right);

		}
	}

	public void postOrder() {
		Node<T> curr = root;
		System.out.println("\nPost-Order");
		System.out.println("*********");
		printPostOrder(curr);
		System.out.println("\n*********");
	}

	public void printPostOrder(Node<T> curr) {
		if (curr != null) {
			printPostOrder(curr.left);
			printPostOrder(curr.right);
			System.out.print(curr.item + "  ");

		}
	}

	public int height() {
		return findHeight(root);

	}

	public int findHeight(Node<T> curr) {
		if (curr == null)
			return -1;
		else {
			int leftHeight = findHeight(curr.left);
			int rightHeight = findHeight(curr.right);
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}
}