package LinkedList;

/**
 * Created by Xsnud on 2016-06-13.
 */

public class Node <E> {

    private Node next;
    private E data;

    public Node(E data) {
        this.data = data;
    }

    public Node() {

    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
}