import java.util.Scanner;

public class Shopping {

    String name;
    int quantity;

    public Shopping(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextLine()) {
            String item = s.nextLine();
            String[] parts = item.split(":");
            // System.out.println(parts[0]);
            if (item.equalsIgnoreCase("exit")) {
                break;
            }
            new Shopping(parts[0], Integer.parseInt(parts[1]));
        }
    }
}