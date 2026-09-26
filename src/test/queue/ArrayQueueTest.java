package queue;

/** Runs the Queue contract suite against ArrayQueue. */
public class ArrayQueueTest extends QueueTest {

  @Override
  protected Queue<Integer> createQueue() {
    return new ArrayQueue<>();
  }
}
