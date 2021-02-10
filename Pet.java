import java.util.Random;
import java.util.ArrayList;

public class Pet {
    String name;
    String[] nicknames;
    int age;
    String species;
    boolean isTrained;

    public Pet(String name, String[] nicknames, int age, String species, boolean isTrained) {
        this.name = name;
        this.nicknames = nicknames;
        this.age = age;
        this.species = species;
        this.isTrained = isTrained;
    }

    public String getName() {
        return this.name;
    }
    public String[] getNicknames() {
        return this.nicknames;
    }
    public int getAge() {
        return this.age;
    }
    public String getSpecies() {
        return this.species;
    }
    public boolean isTrained() {
        return this.isTrained;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNicknames(String[] nicknames) {
        this.nicknames = nicknames;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public void setTrained(boolean isTrained) {
        this.isTrained = isTrained;
    }
    public boolean equals(Pet pet1, Pet pet2) {
        if ((pet1.name == pet2.name) && (pet1.age == pet2.age) && (pet1.species == pet2.species)) {
            return true;
        } else {
            return false;
        }
    }
    public void addNickname(String name) {
        for (int i = 0; i < nicknames.length; i ++) {
            if (nicknames[i] == null) {
                nicknames[i] = name;
                return;
            }
        }
        for (int i = 1; i < nicknames.length; i++) {
            nicknames[i] = nicknames[i-1];
        }
        nicknames[0] = name;
    }
    public boolean hasNickname(String name) {
        if (name == null) {
            return false;
        }
        for (int i = 0; i < nicknames.length; i++) {
            if (name.equalsIgnoreCase(nicknames[i])) {
                return true;
            }
        }
        return false;
    }

}

public class OldestPet {
    public static void main(Strings[] args) {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        for (int i = 0; i < 5; i++) {
            pets.add(new Pet("Pet"+i, {"hello"}, Math.random*10, "Species"+i, true));
        }
        int oldestpet = pets[0];
        for (int i = 0; i < pets.length; i++) {
            if (pets[i].age > oldestpet.age) {
                oldestpet = pets[i];
            }
        }
        System.out.println(oldestpet.name);
        System.out.println(oldestpet.age);
        System.out.println(oldestpet.species);
        System.out.println(oldestpet.isTrained);

    }
}