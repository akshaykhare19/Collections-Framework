import java.util.ArrayDeque;

//Doubly-Ended Queue, here we can insert or delete elements from both ends

public class LearnArrayDeque
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        //adds element at the end of the queue
        adq.offer(2);

        //adds element at the front of the queue
        adq.offerFirst(10);

        //adds element at the end of the queue(same as offer())
        adq.offerLast(5);

        adq.offer(6);
        System.out.println(adq);

        //peek() returns first element
        System.out.println(adq.peek());

        //peekFirst() returns first element
        System.out.println(adq.peekFirst());

        //peekLast() returns last element
        System.out.println(adq.peekLast());

        //poll() removes and returns first element
        System.out.println(adq.poll());
        System.out.println("poll(): " + adq);
        
        //pollFirst() removes and returns first element
        System.out.println(adq.pollFirst());
        System.out.println("pollFirst(): " + adq);

        //pollLast() removes and returns last element
        System.out.println(adq.pollLast());
        System.out.println("pollLast(): " + adq);
    }
}