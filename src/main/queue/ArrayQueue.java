package queue;

import java.util.NoSuchElementException;

/**
 * An array-backed implementation of the Queue ADT.
 *
 * @param <T> the type of elements in this queue.
 */
public class ArrayQueue<T> implements Queue<T> {

  private T[] arr;    // the backing array, used as a circular array
  private int front;  // the index of the front item
  private int size;   // how many items are in the queue

  // arr only ever holds T, so the cast is safe.
  @SuppressWarnings("unchecked")
  public ArrayQueue() {
    arr = (T[]) new Object[10];  // start with room for 10 items
    front = 0;                   // the front starts at index 0
    size = 0;                    // the queue starts empty
  }

  @Override
  public void enqueue(T item) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Override
  public void dequeue() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Override
  public T front() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Override
  public boolean isEmpty() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Doubles the capacity. Same cast rationale as the constructor.
  @SuppressWarnings("unchecked")
  private void grow() {
    T[] bigger = (T[]) new Object[arr.length * 2];
    for (int i = 0; i < size; i++) {
      bigger[i] = arr[(front + i) % arr.length];  // the i-th item of the queue, in order
    }
    arr = bigger;
    front = 0;  // the queue now starts at the beginning of the new array
  }
}
