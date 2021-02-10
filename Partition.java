

public class Partition {

    static int[][] partition(int[] array, int k) {
        int partitions = (int) Math.pow(2, k);
        int partitionSize = array.length / partitions;
        int[][] result = new int[partitions][partitionSize];

        int n = 0;
        int i = 0;
        while (i < partitions) {
            int j = 0;
            while (j < partitionSize) {
                result[i][j] = array[n];
                j++;
                n++;
            }
            i++;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] x = {3, 2, 4, 7, 8, 9, 2, 3};
        int[][] result = partition(x, 2);

        for (int[] arr : result) {
            System.out.println("partition");
            for (int f : arr) {
                System.out.println(f);
            }
        }
    }
}