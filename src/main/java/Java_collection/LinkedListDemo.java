package Java_collection;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args)
    {
        LinkedList l = new LinkedList();
        l.add("cow");
        l.add("chicken");
        l.add("dog");
        l.add("apple");
        System.out.println(l);

        l.addFirst("apple");
        l.addLast("pineapple");
        System.out.println(l);

        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        l.removeFirst();
        l.removeLast();
        System.out.println(l);


    }
}
