package customqueue;

class Element<E> {
	E item;
	Element<E> next;

	Element(E item, Element<E> next) {
		this.item = item;
		this.next = next;
	}
}

class CustomQueue<T> implements CustomQueueInterface<T> {
	Element<T> top = null;
	Element<T> root = null;
	int count = 0;

	//
	public void enqueue(T newItem) {
		Element<T> newElement = new Element<T>(newItem, null);
		if (root == null) {
			++count;
			root = newElement;
			top = newElement;
		} else {
			count++;
			top.next = newElement;
			top = newElement;
		}
	}

	public T dequeue() {
		T valueToDelete = null;
		if (!isEmpty()) {
			count--;
			valueToDelete = root.item;
			root = root.next;
		}
		return valueToDelete;
	}

	public boolean isEmpty() {
		if (root == null)
			return true;
		else
			return false;
	}

	public int count() {
		return count;
	}
}