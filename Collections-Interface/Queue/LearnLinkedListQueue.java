import java.util.LinkedList;
import java.util.Queue;

//Queue is FIRST IN FIRST OUT

public class LearnLinkedListQueue
{
    public static void main(String[] args)
    {
        //linked list implements queue interface also
        Queue<Integer> queue = new LinkedList<>();

        //offer(element) adds new element to the queue, returns true/false
        //alternate method for offer() is add() which returns true if task is successful,
        //if not, it throws an exception
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        queue.offer(48);

        System.out.println(queue);

        //poll() removes and also returns the element, if queue is empty, then it returns null.
        //alternate method is remove() which returns and removes head of the queue,
        //but throws an exception if the queue is empty.
        System.out.println(queue.poll());

        System.out.println(queue);

        //peek() returns the head of the queue. Returns null if the queue is empty
        //alternate method is element() which returns head of the queue and throws
        //an exception if queue is empty
        System.out.println(queue.peek());
    }
}