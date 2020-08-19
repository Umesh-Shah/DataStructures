package LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Adding items to linked list
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(25);
        ll.addFirst(5);

        // removing items in linked list
        ll.removeLast();
        ll.removeFirst();
        ll.removeLast();

        // checking size, index and element in the liked list
        System.out.println(ll.contains(50));
        System.out.println(ll.indexOf(30));
        System.out.println(ll.size());

        // printing linked list
        System.out.println("This is the starting of reverse:");
        var array = ll.toArray();
        System.out.println(Arrays.toString(array));

        // reversing the liked list
        ll.reverse();
        var array2 = ll.toArray();
        System.out.println(Arrays.toString(array2));

        ll.addLast(15);
        ll.addLast(40);
        var array3 = ll.toArray();
        System.out.println(Arrays.toString(array3));

        // finding the kthe element to the end in the liked list
        System.out.println(ll.getKthFromTheEnd(2));

        // searching for the middle element in the liked list
        ll.printMiddle();

        // checking for circular dependency in the linked list
        System.out.println(ll.hasLoop());

    }
}
