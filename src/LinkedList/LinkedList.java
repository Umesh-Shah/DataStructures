package LinkedList;

import java.util.NoSuchElementException;
public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.setNext(node);
            last = node;
        }
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.setNext(first);
            first = node;
        }
        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.getValue() == item) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
            size--;
            return;
        }
        var second = first.getNext();
        first.setNext(null);
        first = second;
        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
            size--;
            return;
        }
        var previous = getPrevious(last);
        previous.setNext(null);
        last = previous;
        size--;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.getNext() == node)
                return current;
            current = current.getNext();
        }
        return null;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while (current != null) {
            array[index++] = current.getValue();
            current = current.getNext();
        }
        return array;
    }

    public void reverse() {
        if (isEmpty()) return;
        var previous = first;
        var current = first.getNext();

        while (current != null) {
            var next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        last = first;
        last.setNext(null);
        first = previous;
    }

    public int getKthFromTheEnd(int k) {
        if (k > size) {
            return -1;
        }
        Node pointerOne = first;
        Node pointerTwo = first;
        for (int i = 0; i < k - 1; i++) {
            pointerTwo = pointerTwo.getNext();
        }
        while (pointerTwo != last) {
            pointerOne = pointerOne.getNext();
            pointerTwo = pointerTwo.getNext();
        }
        return pointerOne.getValue();
    }

    public void printMiddle(){
        if(isEmpty()){
            throw new IllegalArgumentException();
        }
        Node pointerOne = first;
        Node pointerTwo = first;

        while(pointerTwo != last && pointerTwo.getNext()!=last){
            pointerOne = pointerOne.getNext();
            pointerTwo = pointerTwo.getNext().getNext();
        }
        if(pointerTwo== last){
            System.out.println(pointerOne.getValue());
        } else {
            System.out.println(pointerOne.getValue() +","+ pointerOne.getNext().getValue());
        }
    }

    private void setLoop(){
        last.setNext(first);
    }

    public boolean hasLoop(){
        setLoop();
        if(first == last)
            return false;
        Node slow, fast;
        slow = fast = first;
        while(true){
            slow = slow.getNext();
            if(fast.getNext() != null && fast.getNext().getNext() != null)
                fast = fast.getNext().getNext();
            else
                return false;
            if(slow ==null || fast ==null)
                return false;
            if(slow==fast)
                return true;
        }
    }
}
