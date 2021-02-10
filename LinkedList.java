import java.util.Iterator;

class Node<E> {

    public E value;
    public Node<E> next;

    public Node(E value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedList<T> {
    private Node<T> root;
    private long size;

    public LinkedList() {
        this.root = null;
        this.size = 0;
    }

    public long size() {
        return this.size;
    }

    public void add(T element) {
        if (element == null) return;
        Node<T> node = new Node(element);
        if (this.size == 0) {
            this.root = node;
            this.size++;
            return;
        }
        Node<T> cursor = this.root;
        while (cursor.next != null) {
            cursor = cursor.next;
        }
        cursor.next = node;
        this.size++;
    }

    public void set(int index, T element) {
        if (index >= this.size || index < 0) return;
        if (element == null) return;
        int i = 0;
        Node<T> cursor = this.root;
        while (i < index) {
            cursor = cursor.next;
            i++;
        }
        cursor.value = element;
    }

    public T get(int index) {
        if (index >= this.size || index < 0) return null;
        int i = 0;
        Node<T> cursor = this.root;
        while (i < index) {
            cursor = cursor.next;
            i++;
        }
        return cursor.value;
    }

    public T remove(int index) {
        if (index >= this.size || index < 0) return null;
        if (index == 0) {
            T elem = this.root.value;
            this.root = this.root.next;
            this.size -= 1;
            return elem;
        } else {
            int i = 0;
            Node<T> cursor = this.root;
            while (i < index - 1) {
                cursor = cursor.next;
                i++;
            }
            T elem = cursor.next.value;
            cursor.next = cursor.next.next;
            this.size -= 1;
            return elem;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(1);
        System.out.println(ls.size());
    }
}

class LinkedListIterator<T> implements Iterator<T> {

    private Node<T> current;

    public LinkedListIterator(Node<T> current) {
        this.current = current;
    }

    public T next() {
        this.current = this.current.next;
        return this.current.value;
    }

    public boolean hasNext() {
        return this.current.next != null;
    }
}