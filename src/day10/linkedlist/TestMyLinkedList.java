package day10.linkedlist;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/=/Testing=/=//=/====//=/");
    MyLinkedList ll=new MyLinkedList(1);
    ll.addFirst(11);
    ll.addFirst(12);
    ll.addFirst(13);
    ll.addFirst(14);
    ll.addFirst(15);

    ll.add(4,9);
    ll.add(4,10);
    ll.prinList();
//    ll.removeLast();
    }
}
