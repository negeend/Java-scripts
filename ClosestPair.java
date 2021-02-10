import java.util.List; 
import java.util.ArrayList; 
import java.util.Random;

class Point {
    private double x;
    private double y;
    public Point(double x, double y) { this.x = x; this.y = y; }

    public double x() { return x; }
    public double y() { return y; }
    public String toString() { return "(" + x + "," + y + ")"; }
}

public class ClosestPair {

    public static List<? extends Point> generatePoints(int n) { 
        List<Point> points = new ArrayList<Point>();
        Random r = new Random();
        for(int i = 0; i < n; i++) {
            points.add(new Point(r.nextDouble(), r.nextDouble())); 
        }
        return points; 
        }

    public static Point[] closestPair(List<? extends Point> points) { 
        Point[] pair = new Point[2];
        double minDistance = 0.0;
        int i = 0;
        while (i < points.size()) {
            int j = 0;
            while (j < points.size()) {
                if (i != j) {
                    double distance = Math.sqrt((points.get(i).x() - points.get(j).x()) + (points.get(i).y() - points.get(j).y()));
                    if (distance < minDistance) {
                        minDistance = distance;
                        pair[0] = points.get(i);
                        pair[1] = points.get(j);
                    }
                }
            j++;
            }
        i++;
        }
        return pair;
    }

    public static void main(String[] args) {

    }
}