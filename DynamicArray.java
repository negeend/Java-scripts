package my.collections;

public class DynamicArray {
    private int size;
    private int[] array;
    private int capacity;

    public DynamicArray() {
        this.size = 0;
        this.capacity = 10;
        this.array = new int[this.capacity];
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        return this.array[index];
    }

    public void set(int element, int index) {
        if (index < 0 || index >= size) return;
        this.array[index] = element;
    }

    public void add(int element) {
        if (this.size == this.capacity) {
            int[] newArray = new int[capacity*2];
            for (int i = 0; i < this.array.length; i++) {
                newArray[i] = this.array[i];
            }
            newArray[this.array.length] = element;
            this.array = newArray;
        } else {
            this.array[size] = element;
        }
        size++;

    }


}