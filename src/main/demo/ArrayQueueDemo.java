package demo;

import queue.ArrayQueue;

/** A demo of ArrayQueue on the shared printer example from the notes. */
public final class ArrayQueueDemo {

  private ArrayQueueDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    ArrayQueue<String> jobs = new ArrayQueue<>();

    // Three print jobs arrive in this order.
    jobs.enqueue("essay.pdf");
    jobs.enqueue("homework.docx");
    jobs.enqueue("poster.png");
    System.out.println("front after three jobs: " + jobs.front());

    // Serve them all. Expect the order they arrived:
    // essay.pdf, then homework.docx, then poster.png.
    while (!jobs.isEmpty()) {
      // dequeue() returns nothing, so serving a job is a front() followed by a dequeue().
      System.out.println("printing " + jobs.front());
      jobs.dequeue();
    }
    System.out.println("empty: " + jobs.isEmpty());
  }
}
