import java.util.ArrayList;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("helloo");
        strings.add("hi");
        strings.add("sjdbfkscrvs");
        strings.add("s");
        strings.add("s");
        strings.add("veryyyyyyyy long");

        strings.stream().filter((String s) -> s.length() > 5).forEach(System.out::println);   
    }
}