import java.util.ArrayList; 
import java.util.Arrays;

public class Intersection {
    static Object[] intersection(int[] x, int[] y) {
        ArrayList<Integer> intersection = new ArrayList<>();
        for (int num : x) {
            for (int num2 : y) {
                if (num == num2) {
                    intersection.add(num);
                    continue;
                }
                continue;
            }
            continue;
        }
        Object[] arr = intersection.toArray();
        return arr;
    }

public static void main(String[] args) {
    int[] x = {1, 2, 5, 6, 0, 8, 7};
    int[] y = {3, 1, 2, 6, 10};
    Object[] result = intersection(x, y);
    System.out.println( Arrays.toString(result) );
}

}