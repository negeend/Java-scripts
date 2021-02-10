public class Fib {

    public int fibonacci(int n) {
        if (n < 1) return -1;
        if (n == 1) return 0;
        if (n == 2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);

    }

    public static void main(String[] args) {
        Fib fib = new Fib();
        System.out.println(fib.fibonacci(9));
    }
}