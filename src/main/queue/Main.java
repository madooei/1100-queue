package queue;

/** A demo of the Queue ADT: a shared printer's print jobs. */
public final class Main {

  private Main() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    System.out.println("LinkedQueue:");
    printSession(new LinkedQueue<>());
    System.out.println("ArrayQueue:");
    printSession(new ArrayQueue<>());
  }

  // Sends three print jobs, then prints all of them in the order they arrived.
  private static void printSession(Queue<String> jobs) {
    jobs.enqueue("essay.pdf");
    jobs.enqueue("homework.docx");
    jobs.enqueue("poster.png");
    while (!jobs.isEmpty()) {
      // dequeue() returns nothing, so serving a job is a front() followed by a dequeue().
      System.out.println("  printing " + jobs.front());
      jobs.dequeue();
    }
  }
}
