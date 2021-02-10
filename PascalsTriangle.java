import java.util.ArrayList;
import java.util.*;

public class PascalsTriangle {
    ArrayList<Integer> previousRow;
    ArrayList<ArrayList<Integer>> rows;

    public PascalsTriangle() {
        this.previousRow = new ArrayList<Integer>();
        this.rows = new ArrayList<ArrayList<Integer>>();
    }

    public void outputTriangle(int n) {
        ArrayList<Integer> row = new ArrayList<Integer>(Arrays.asList(1));
        rows.add(row);
        if (n == 0) {
            for (ArrayList<Integer> arr : rows) {
                System.out.println(arr);
            }
            return;
        }
        ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(1, 1));
        rows.add(row2);
        this.previousRow = row2;
        if (n == 1) {
            for (ArrayList<Integer> arr : rows) {
                System.out.println(arr);
            }            
            return;
        } else {
            int i = 2;
            while (i <= n) { 
                ArrayList<Integer> newRow = new ArrayList<>();
                newRow.add(1);
                int j = 1;
                while (j < i) {
                    newRow.add(this.previousRow.get(j - 1) + this.previousRow.get(j));
                    j++;
                }
                i++;
                newRow.add(1);
                rows.add(newRow);
                this.previousRow = newRow;
            }
            for (ArrayList<Integer> arr : rows) {
                System.out.println(arr);
            }   
        }
    }

    public ArrayList<Integer> outputTriangleRec(int n) {
        if (n == 0) {
            ArrayList<Integer> row = new ArrayList<Integer>(Arrays.asList(1));
            return row;
        }
        if (n == 1) {
            ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(1, 1));
            return row2;
        } else {
            ArrayList<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            ArrayList<Integer> prev = outputTriangleRec(n-1);
            int j = 1;
            while (j < n) {
                newRow.add(prev.get(j - 1) + prev.get(j));
                j++;
            }
            newRow.add(1);
            return newRow;
        }
    }

    public void pascalRecOutput(int n) {
        int count = 0;
        while(count <= n) {
            System.out.println(outputTriangleRec(count));
            count++;
        }
    }

    public static void main(String[] args) {
        PascalsTriangle tri = new PascalsTriangle();
        // tri.outputTriangle(4);
        tri.pascalRecOutput(420);
    }
}