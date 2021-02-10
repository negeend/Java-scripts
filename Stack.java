class Node<T> {
    public T value;
    public Node<T> next;

    public Node(T value){
        this.value = value;
        next = null;
    }
}

public class Stack<T> {
    public Node<T> root;
    private int size;

    public Stack(){
        this.root = null;
        this.size = 0;
    }

    public T peek() {
        if (this.size == 0) {
            return null;
        }
        return root.value;
    }

    public T pop() {
        if (this.size == 0) {
            return null;
        }
        T initialRoot = root.value;
        Node<T> cursor = root;
        root = cursor.next;
        size -= 1;
        return initialRoot;
    }

    public int size() {
        return size;
    }

    public void push(T elem) {
        if (elem == null) {
            return;
        }
        Node<T> newNode = new Node<T>(elem);
        if(root == null)
            root = newNode;
        else{
            Node<T> temp = root;
            root = newNode;
            newNode.next = temp;
        }
        size++;
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

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