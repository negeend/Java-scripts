import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class Athlete {

    String name;
    double time;

    public Athlete(String name, double time) {
        this.name = name;
        this.time = time;
    }

    public String toString() {
        return name + " " + time;
    }


    public static void main(String[] args) {

        ArrayList<Athlete> athletes = new ArrayList<Athlete>();
        ArrayList<Athlete> sortedAthletes = new ArrayList<Athlete>();
        ArrayList<Double> times = new ArrayList<Double>();

        try{
            File f = new File("Athlete.txt");
            Scanner s = new Scanner(f);
            while(s.hasNextLine()) {
                String athlete = s.nextLine();
                String[] parts = athlete.split(",");
                if (parts.length < 1) {
                    continue;
                }
                try {
                    athletes.add(new Athlete(parts[0], Double.parseDouble(parts[1])));
                    times.add(Double.parseDouble(parts[1]));
                } catch (NumberFormatException e) {
                    continue;
                }
            }
        } catch(FileNotFoundException e) {
            System.out.println("File not found.");
        }
        Collections.sort(times);

        for (double time : times) {
            for (Athlete athlete : athletes) {
                if (athlete.time == time) sortedAthletes.add(athlete);
            }
        }

        for (Athlete athlete : sortedAthletes) {
            System.out.println(athlete);
        }

    }
}