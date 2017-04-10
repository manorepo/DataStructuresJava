package DoubleLinkedList;

public interface DoubleLinkedListInterface<T> {
	public void addFirst(T newItem);

	public void addLast(T newItem);

	public T removeLast();

	public T removeFirst();

	public boolean isEmpty();

	public void insertAt(int index, T newItem);
}