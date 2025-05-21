package ownDs.linkedlist;

public class DoublyLinkedList {
    Node head;
    Node tail;
    void insertEnd(int data){
        Node node = new Node();
        node.data = data;
        if(head == null){
            head = tail = node;
        }else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }
    void insertFront(int data){
        Node node = new Node();
        node.data = data;
        if(head == null){
            head = tail = node;
        }else{
            node.next = head;
            head.prev = node;
            head = node;
        }
    }
    void printForward(){
        if(head == null){
            System.out.println("No data");
        }
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    void printBackwards(){
        if(tail == null){
            System.out.println("No data");
        }
        Node temp = tail;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.printBackwards();
        doublyLinkedList.printForward();
        doublyLinkedList.insertEnd(10);
        doublyLinkedList.insertFront(9);
        doublyLinkedList.insertEnd(11);
        doublyLinkedList.printForward();
        doublyLinkedList.printBackwards();
    }
}
