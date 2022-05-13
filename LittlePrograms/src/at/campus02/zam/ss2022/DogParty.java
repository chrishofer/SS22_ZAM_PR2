package at.campus02.zam.ss2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DogParty {
    public static void main(String[] args) {
        Dog scooby = new Dog("ScoobyDoo", "black", 40, true);

        System.out.println(scooby);
        scooby.bark();

        //Dog hund = new Dog();
        //hund.bark();

        Beagle max = new Beagle("Hansi", "blue", 80, true, "Germknödel");
        System.out.println(max);
        max.bark();

        Dog snoopy = new Dog("Snoopy", "white", 12, true);

        Dog snoopy2 = new Dog("Snoopy", "white", 24, true);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(snoopy2);
        dogs.add(scooby);
        dogs.add(max);
        dogs.add(snoopy);



        System.out.println(dogs);
        Collections.sort(dogs);
        System.out.println(dogs);


    }
}
