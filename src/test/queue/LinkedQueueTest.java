package queue;

/** Runs the Queue contract suite against LinkedQueue. */
public class LinkedQueueTest extends QueueTest {

  @Override
  protected Queue<Integer> createQueue() {
    return new LinkedQueue<>();
  }
}
