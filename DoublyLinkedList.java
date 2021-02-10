import java.util.*;

class Node<T> {

    public T value;
    public Node<T> next;
    public Node<T> previous;

    public Node(T value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }
}

public class DoublyLinkedList<T> {
    private Node<T> root;
    private int size;

    public DoublyLinkedList() {
        this.root = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public void add(T element) {
        if (this.size == 0) {
            this.root = new Node(element);
            this.size++;
            return;
        }
        Node<T> cursor = this.root;
        while (cursor.next != null) {
            cursor = cursor.next;
        }
        cursor.next = new Node(element);
        cursor.next.previous = cursor;
        this.size++;
    }

    public T peek() {
        return this.root.value;
    }

    public void removeFirst() {
        if (this.size == 0) return;
        this.root = this.root.next;
        this.size -= 1;
        this.root.previous = null;
    }

    public void removeLast() {
        Node<T> cursor = this.root;
        while (cursor.next != null) {
            cursor = cursor.next;
        }
        cursor = null;
        this.size -= 1;
    }

    public void reversePrint() {
        Node<T> cursor = this.root;
        while (cursor.next != null) {
            cursor = cursor.next;
        }
        System.out.println(cursor.value);
        while (cursor.previous != null) {
            cursor = cursor.previous;
            System.out.println(cursor.value);

        }
    }

    public static void main(String[] args) {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.reversePrint();
    }
}