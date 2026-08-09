package Java_collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args)
    {
       PriorityQueue pq = new PriorityQueue();////Heterogenious data not allow
        pq.add("A");
        pq.add("B");
        pq.add("C");
        pq.add("C");
        System.out.println(pq);///insertion order preserved and duplicate allowed

        ///get head element
        ///System.out.println(pq.element());///Return head element, if queue is empty throw NoSuchElement
        ///System.out.println(pq.peek());///Return head element, if empty throw null

        ///return and remove element from queue. remove() and poll()
        ///System.out.println(pq.remove());////if queue is empty throw NoSuchElement
        ///System.out.println(pq);
        ///System.out.println(pq.poll());////if queue is empty throw null
        ////System.out.println(pq);
        /*Iterator it = pq.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }*/

        for (Object rr:pq)
            {
            System.out.println(rr);
            }







    }
}
