public class GenericArray<T> {
    private long size;
    private T[] array;
    private int capacity;

    public GenericArray() {
        this.size = 0;
        this.capacity = 10;
        this.array = (T[]) new Object[this.capacity];
    }

    public long size() {
        return this.size;
    }

    public T get(int index) {
        if (index < 0 || index >= size) return null;
        return this.array[index];
    }

    public void set(T element, int index) {
        if (index < 0 || index >= size) return;
        this.array[index] = element;
    }

    public void add(T element) {
        if (this.size == this.capacity) {
            T[] newArray = (T[]) new Object[capacity*2];
            for (int i = 0; i < this.array.length; i++) {
                newArray[i] = this.array[i];
            }
            newArray[this.array.length] = element;
            this.array = newArray;
        } else {
            int i = (int) this.size;
            this.array[i] = element;
        }
        size++;

    }
    
    public long resize(long newSize) {
        int ns = (int) newSize;
        T[] temp = (T[]) new Object[ns];
        for (int i = 0; i < this.array.length; i++) {
            temp[i] = this.array[i];
        }
        long ret = this.size;
        this.array = temp;
        return ret;
    } 
}