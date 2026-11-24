# Queue

The `Queue` ADT with two implementations, one backed by a linked list and one backed by a circular array. A JUnit suite checks both implementations against the same contract.

## Prerequisites

- JDK 17+
- The JUnit jar is already vendored in `lib/`; there is nothing to download.

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  lib/
    junit-platform-console-standalone-6.1.0.jar
  src/
    main/
      queue/
        Queue.java               # the Queue ADT contract
        LinkedQueue.java         # node-backed Queue
        ArrayQueue.java          # array-backed Queue
      demo/                      # one demo per implementation
        LinkedQueueDemo.java
        ArrayQueueDemo.java
    test/
      queue/
        QueueTest.java           # abstract: the Queue contract suite
        LinkedQueueTest.java     # runs the suite against LinkedQueue
        ArrayQueueTest.java      # runs the suite against ArrayQueue
  scripts/
    test.sh                      # compile and run every JUnit test
    run.sh                       # compile and run one demo
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite.
- `scripts/test.sh queue.ArrayQueueTest` — compiles everything and runs only that test class. Use this while you are working on one class and the other is still empty.
- `scripts/run.sh demo.ArrayQueueDemo` — compiles everything and runs that one demo. Every class you implement has its own demo, `<Class>Demo`.

## What's here

- `queue.Queue<T>` — the Queue contract: `enqueue`, `dequeue`, `front`, and `isEmpty`.
- `queue.LinkedQueue<T>` — the node-backed implementation, with the front at the head of the list and the back at the tail.
- `queue.ArrayQueue<T>` — the array-backed implementation, using the array as a circular array.
- `queue.QueueTest` — the abstract contract suite.
- `queue.LinkedQueueTest` — runs the contract suite against `LinkedQueue`.
- `queue.ArrayQueueTest` — runs the contract suite against `ArrayQueue`.
- `demo.LinkedQueueDemo` and `demo.ArrayQueueDemo` — one demo per implementation, each on the shared printer example from the notes.
