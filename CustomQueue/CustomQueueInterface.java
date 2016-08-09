package CustomQueue;
  public interface CustomQueueInterface<T>
  {
  public void enqueue(T item);
  public T dequeue();
  public boolean isEmpty();
  }