import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackExample {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();

    stack.push("Apple");
    stack.push("Banana");
    stack.push("Cherry");

    System.out.println("Stack: " + stack);

    System.out.println("Top item: " + stack.peek());

    System.out.println("Popped: " + stack.pop());

    System.out.println("Stack after pop: " + stack);

    // =========== Queue =============

    Queue<String> queue = new LinkedList<>();

    queue.add("Dog");
    queue.add("Cat");
    queue.add("Horse");

    System.out.println("Queue: " + queue);

    System.out.println("Head of queue: " + queue.peek());

    System.out.println("Removed: " + queue.remove());

    System.out.println("Queue after remove: " + queue);

  }
}
