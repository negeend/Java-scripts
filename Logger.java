import java.util.*;

public class Logger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<String>> lists = new ArrayList<ArrayList<String>>();

        ArrayList<String> list = new ArrayList<String>();

        while (scan.hasNextLine()) {
            String line = scan.nextLine();

            if (line.equals("END LOG")) {
                lists.add(list);
                list = new ArrayList<String>();
                continue;
            } 
            else if (line.equals("")) {
                lists.add(list);
                break;
            }
            list.add(line);

        }
        int i = 0;
        while (i < lists.size() - 1) {
            System.out.println("LOG " + (i+1));
            for (String lines : lists.get(i)) {
                System.out.println(lines);
            }
            System.out.println();
            i++;
        }

    }
}



