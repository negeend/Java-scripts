import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Person {
    public String name; 
    public int age; 
    public double height;

    public Person(String name, int age, double height) { 
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.height;
    }

    public String toString() {
        return this.name;
    }
}

public class FunctionInterfaces {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("joe", 30, 180));
        people.add(new Person("bill", 3, 10));
        people.add(new Person("jack", 1, 180));
        people.add(new Person("jeff", 50, 170));
        
        List<Person> admittable = people.stream().filter((Person p) -> p.getAge() > 6 && p.getHeight() > 140).collect(Collectors.toList());
        System.out.println(admittable);

    }
}