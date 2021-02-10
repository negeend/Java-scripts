import java.util.ArrayList;

public class Duplicates {

    static int countDuplicates(int[] a) {
        ArrayList<Integer> dups = new ArrayList<>();
        int i = 0;
        while (i < a.length) {
            int j = 0;
            while (j < a.length) {
                if (a[i] == a[j] && i != j) {
                    if (dups.contains(a[i]) == false) {
                        dups.add(a[i]);
                    }
                }
                j++;
            }
            i++;
        }
        return dups.size();
    }

    public static void main(String[] args) {
        int[] dups = {1, 1, 5, 6, 5, 3, 8, 1, 9, 2, 8};
        int result = countDuplicates(dups);
        System.out.println(result);
    }
}