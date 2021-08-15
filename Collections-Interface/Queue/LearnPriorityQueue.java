import java.util.Comparator;
import java.util.PriorityQueue;

//Implementing queue while giving priority to some elements


public class LearnPriorityQueue 
{
    public static void main(String[] args)
    {
        //[This PriorityQueue works on the principles of Min Heap]
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //offer(element) adds new element to the queue, returns true/false
        //alternate method for offer() is add() which returns true if task is successful,
        //if not, it throws an exception
        pq.offer(50);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        pq.offer(48);

        System.out.println(pq);

        //poll() removes and also returns the element, if queue is empty, then it returns null.
        //alternate method is remove() which returns and removes head of the queue,
        //but throws an exception if the queue is empty.
        System.out.println(pq.poll());

        System.out.println(pq);

        //peek() returns the head of the queue. Returns null if the queue is empty
        //alternate method is element() which returns head of the queue and throws
        //an exception if queue is empty
        System.out.println(pq.peek());

        //[This PriorityQueue works on the principles of Max Heap]
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        pq1.offer(100);
        pq1.offer(170);
        pq1.offer(80);
        pq1.offer(10);
        pq1.offer(800);

        System.out.println(pq1);

        System.out.println(pq.poll());
        System.out.println(pq.peek());

    }    
}
