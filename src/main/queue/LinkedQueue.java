package queue;

import java.util.NoSuchElementException;

/**
 * A node-backed implementation of the Queue ADT.
 *
 * @param <T> the type of elements in this queue.
 */
public class LinkedQueue<T> implements Queue<T> {

  private Node<T> head;  // the front of the queue, or null when empty
  private Node<T> tail;  // the back of the queue, or null when empty

  private static class Node<T> {
    T value;
    Node<T> next;

    Node(T value) {
      this.value = value;
    }
  }

  public LinkedQueue() {
    head = null;  // the queue starts empty
    tail = null;
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
}
