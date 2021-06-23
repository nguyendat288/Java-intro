package day11.queue;

import java.util.Queue;

public class Node<E> {
    public int key;
    public Node next;
    public Node(int key){
        this.key=key;
        this.next=null;
    }
}
