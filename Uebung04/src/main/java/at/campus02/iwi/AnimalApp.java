package at.campus02.iwi;

import java.util.ArrayList;
import java.util.List;

public class AnimalApp {
    public static void main(String[] args) {
        // part 1
        Frog quaxi = new Frog("green", 2);
        // upcasting works automatically nevertheless we could (Animal) quaxi
        Animal quaxiAsAnimal = quaxi;
        //quaxiAsAnimal = new Lion("brown", 2);
        Frog sameQuaxi = (Frog)quaxiAsAnimal; // only works if there is really a frog on it

        quaxi.makeNoise();
        quaxiAsAnimal.makeNoise(); // as animal we can only use animal methods (no frog methods if he had more)
        sameQuaxi.makeNoise();


        // part 2
        Nature n = new Nature();
        n.addAnimal(quaxi);
        n.addAnimal(new Lion("red", 8));
        n.addAnimal(new Frog("green", 2));

        System.out.println(n.countColor("red"));
        System.out.println(n.countColor("green"));

        // part 3 - interfaces
        // upcasting no problem
        Fly flyable = new Bird("blue");
        Bird b = (Bird)flyable; // downcasting if we know what is behind
        //b.winkeWinke()  // we see every method
        flyable.fly();


        Fly fly2 = giveMeSomethingThatCanFly();
        fly2.fly();

        ArrayList<Fly> allThingsInTheSky = new ArrayList<>();
        System.out.println("****");
        //allThingsInTheSky.add(quaxi); // does not work cause quaxi can't fly
        allThingsInTheSky.add(flyable);
        allThingsInTheSky.add(fly2);

        for(Fly f : allThingsInTheSky){
            f.fly();
        }

        /*ArrayList<String> strings = new ArrayList<>();
        strings.add("hi");
        strings.add("bye");

        for(String st : strings)
         */
        //List<String> myList = new ArrayList<>();
    }
    public static Fly giveMeSomethingThatCanFly(){
        return new Bird("green");
    }
}
