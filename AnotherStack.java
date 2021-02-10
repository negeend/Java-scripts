import java.util.*;

class Node<T> {
    public T value;
    public Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }
}

public class AnotherStack<T> {

    private Node<T> bottom; //root
    private Node<T> top;
    private int size;

    public AnotherStack() {
        this.bottom = null;
        this.top = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public T peek() {
        // if (this.size == 0) return null;
        // Node<T> cursor = this.bottom;
        // while (cursor.next != null) {
        //     cursor = cursor.next;
        // }
        // return cursor.value;
        return this.top.value;
    }

    public void pop() {
        if (this.size != 0) {
            Node<T> cursor = this.bottom;
            while (cursor.next.next != null) {
                cursor = cursor.next;
            }
            cursor.next = null;
            this.top = cursor;
            this.size -= 1;
        }
    }

    public void push(T element) {
        if (this.size == 0) {
            this.bottom = new Node(element);
            this.top = new Node(element);
            this.size += 1;
            return;
        } 
        Node<T> cursor = this.bottom;
        while (cursor.next != null) {
            cursor = cursor.next;
        }
        cursor.next = new Node(element);
        this.top = cursor.next;
        this.size += 1;
    }

    public static void main(String[] args) {
        AnotherStack<Integer> stack = new AnotherStack<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.peek());
        stack.push(50);
        System.out.println(stack.size());
        System.out.println(stack.peek());
    }
    
}